package Generated;

public class ServerDistance {
    public static void main(String[] args)
    {
        int status = 0;
        Ice.Communicator ic = null;
        try {
            ic = Ice.Util.initialize(args);
            Ice.ObjectAdapter adapter =
            ic.createObjectAdapterWithEndpoints("SimpleLecteurMP3Adapter", "tcp -h 10.120.11.39 -p 10000");
            Ice.Object objectArc = new PlayerArcI();
            adapter.add(objectArc, ic.stringToIdentity("SimplePlayerMP3Arc"));
            
            Ice.Object objectDsp = new PlayerDspI();
            adapter.add(objectDsp, ic.stringToIdentity("SimplePlayerMP3Dsp"));
            
            adapter.activate();
            ic.waitForShutdown();
            
        } catch (Ice.LocalException e) {
            e.printStackTrace();
            status = 1;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            status = 1;
        }
        if (ic != null) {
            try {
                ic.destroy();
            } catch (Exception e) {
                System.err.println(e.getMessage());
                status = 1;
            }
        }
        System.exit(status);
    }
}