package Generated;


public class Client {
    public static void
    main(String[] args)
    {
        int status = 0;
        Ice.Communicator ic = null;
        try {
            ic = Ice.Util.initialize(args);
            Ice.ObjectPrx base = ic.stringToProxy("SimplePlayerMP3Arc:tcp -h 10.120.11.39 -p 10000");
            Generated.Player.arcPrx ply = Generated.Player.arcPrxHelper.checkedCast(base);
            if (ply == null)
                throw new Error("Invalid proxy");
            System.out.println(ply.findSonByName("bb")[2]);
        } catch (Ice.LocalException e) {
            e.printStackTrace();
            status = 1;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            status = 1;
        }
        if (ic != null) {
            // Clean up
            //
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