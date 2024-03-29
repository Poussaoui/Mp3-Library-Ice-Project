// **********************************************************************
//
// Copyright (c) 2003-2016 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.3
//
// <auto-generated>
//
// Generated from file `PlayerMP3.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package Generated.Player;

/**
 * Provides type-specific helper functions.
 **/
public final class arcPrxHelper extends Ice.ObjectPrxHelperBase implements arcPrx
{
    private static final String __addSon_name = "addSon";

    public void addSon(int id, String name, float[] ms)
    {
        addSon(id, name, ms, null, false);
    }

    public void addSon(int id, String name, float[] ms, java.util.Map<String, String> __ctx)
    {
        addSon(id, name, ms, __ctx, true);
    }

    private void addSon(int id, String name, float[] ms, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        end_addSon(begin_addSon(id, name, ms, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_addSon(int id, String name, float[] ms)
    {
        return begin_addSon(id, name, ms, null, false, false, null);
    }

    public Ice.AsyncResult begin_addSon(int id, String name, float[] ms, java.util.Map<String, String> __ctx)
    {
        return begin_addSon(id, name, ms, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_addSon(int id, String name, float[] ms, Ice.Callback __cb)
    {
        return begin_addSon(id, name, ms, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_addSon(int id, String name, float[] ms, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_addSon(id, name, ms, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_addSon(int id, String name, float[] ms, Callback_arc_addSon __cb)
    {
        return begin_addSon(id, name, ms, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_addSon(int id, String name, float[] ms, java.util.Map<String, String> __ctx, Callback_arc_addSon __cb)
    {
        return begin_addSon(id, name, ms, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_addSon(int id, 
                                        String name, 
                                        float[] ms, 
                                        IceInternal.Functional_VoidCallback __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_addSon(id, name, ms, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_addSon(int id, 
                                        String name, 
                                        float[] ms, 
                                        IceInternal.Functional_VoidCallback __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                        IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_addSon(id, name, ms, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_addSon(int id, 
                                        String name, 
                                        float[] ms, 
                                        java.util.Map<String, String> __ctx, 
                                        IceInternal.Functional_VoidCallback __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_addSon(id, name, ms, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_addSon(int id, 
                                        String name, 
                                        float[] ms, 
                                        java.util.Map<String, String> __ctx, 
                                        IceInternal.Functional_VoidCallback __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                        IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_addSon(id, name, ms, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_addSon(int id, 
                                         String name, 
                                         float[] ms, 
                                         java.util.Map<String, String> __ctx, 
                                         boolean __explicitCtx, 
                                         boolean __synchronous, 
                                         IceInternal.Functional_VoidCallback __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                         IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_addSon(id, 
                            name, 
                            ms, 
                            __ctx, 
                            __explicitCtx, 
                            __synchronous, 
                            new IceInternal.Functional_OnewayCallback(__responseCb, __exceptionCb, __sentCb));
    }

    private Ice.AsyncResult begin_addSon(int id, 
                                         String name, 
                                         float[] ms, 
                                         java.util.Map<String, String> __ctx, 
                                         boolean __explicitCtx, 
                                         boolean __synchronous, 
                                         IceInternal.CallbackBase __cb)
    {
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__addSon_name, __cb);
        try
        {
            __result.prepare(__addSon_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeInt(id);
            __os.writeString(name);
            sonHelper.write(__os, ms);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public void end_addSon(Ice.AsyncResult __iresult)
    {
        __end(__iresult, __addSon_name);
    }

    private static final String __findSonById_name = "findSonById";

    public float[] findSonById(int id)
    {
        return findSonById(id, null, false);
    }

    public float[] findSonById(int id, java.util.Map<String, String> __ctx)
    {
        return findSonById(id, __ctx, true);
    }

    private float[] findSonById(int id, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__findSonById_name);
        return end_findSonById(begin_findSonById(id, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_findSonById(int id)
    {
        return begin_findSonById(id, null, false, false, null);
    }

    public Ice.AsyncResult begin_findSonById(int id, java.util.Map<String, String> __ctx)
    {
        return begin_findSonById(id, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_findSonById(int id, Ice.Callback __cb)
    {
        return begin_findSonById(id, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_findSonById(int id, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_findSonById(id, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_findSonById(int id, Callback_arc_findSonById __cb)
    {
        return begin_findSonById(id, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_findSonById(int id, java.util.Map<String, String> __ctx, Callback_arc_findSonById __cb)
    {
        return begin_findSonById(id, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_findSonById(int id, 
                                             IceInternal.Functional_GenericCallback1<float[]> __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_findSonById(id, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_findSonById(int id, 
                                             IceInternal.Functional_GenericCallback1<float[]> __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_findSonById(id, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_findSonById(int id, 
                                             java.util.Map<String, String> __ctx, 
                                             IceInternal.Functional_GenericCallback1<float[]> __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_findSonById(id, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_findSonById(int id, 
                                             java.util.Map<String, String> __ctx, 
                                             IceInternal.Functional_GenericCallback1<float[]> __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_findSonById(id, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_findSonById(int id, 
                                              java.util.Map<String, String> __ctx, 
                                              boolean __explicitCtx, 
                                              boolean __synchronous, 
                                              IceInternal.Functional_GenericCallback1<float[]> __responseCb, 
                                              IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                              IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_findSonById(id, __ctx, __explicitCtx, __synchronous, 
                                 new IceInternal.Functional_TwowayCallbackArg1<float[]>(__responseCb, __exceptionCb, __sentCb)
                                     {
                                         public final void __completed(Ice.AsyncResult __result)
                                         {
                                             arcPrxHelper.__findSonById_completed(this, __result);
                                         }
                                     });
    }

    private Ice.AsyncResult begin_findSonById(int id, 
                                              java.util.Map<String, String> __ctx, 
                                              boolean __explicitCtx, 
                                              boolean __synchronous, 
                                              IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__findSonById_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__findSonById_name, __cb);
        try
        {
            __result.prepare(__findSonById_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeInt(id);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public float[] end_findSonById(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __findSonById_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            float[] __ret;
            __ret = sonHelper.read(__is);
            __result.endReadParams();
            return __ret;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __findSonById_completed(Ice.TwowayCallbackArg1<float[]> __cb, Ice.AsyncResult __result)
    {
    	Generated.Player.arcPrx __proxy = (Generated.Player.arcPrx)__result.getProxy();
        float[] __ret = null;
        try
        {
            __ret = __proxy.end_findSonById(__result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret);
    }

    private static final String __findSonByName_name = "findSonByName";

    public float[] findSonByName(String name)
    {
        return findSonByName(name, null, false);
    }

    public float[] findSonByName(String name, java.util.Map<String, String> __ctx)
    {
        return findSonByName(name, __ctx, true);
    }

    private float[] findSonByName(String name, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__findSonByName_name);
        return end_findSonByName(begin_findSonByName(name, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_findSonByName(String name)
    {
        return begin_findSonByName(name, null, false, false, null);
    }

    public Ice.AsyncResult begin_findSonByName(String name, java.util.Map<String, String> __ctx)
    {
        return begin_findSonByName(name, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_findSonByName(String name, Ice.Callback __cb)
    {
        return begin_findSonByName(name, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_findSonByName(String name, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_findSonByName(name, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_findSonByName(String name, Callback_arc_findSonByName __cb)
    {
        return begin_findSonByName(name, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_findSonByName(String name, java.util.Map<String, String> __ctx, Callback_arc_findSonByName __cb)
    {
        return begin_findSonByName(name, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_findSonByName(String name, 
                                               IceInternal.Functional_GenericCallback1<float[]> __responseCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_findSonByName(name, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_findSonByName(String name, 
                                               IceInternal.Functional_GenericCallback1<float[]> __responseCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                               IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_findSonByName(name, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_findSonByName(String name, 
                                               java.util.Map<String, String> __ctx, 
                                               IceInternal.Functional_GenericCallback1<float[]> __responseCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_findSonByName(name, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_findSonByName(String name, 
                                               java.util.Map<String, String> __ctx, 
                                               IceInternal.Functional_GenericCallback1<float[]> __responseCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                               IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_findSonByName(name, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_findSonByName(String name, 
                                                java.util.Map<String, String> __ctx, 
                                                boolean __explicitCtx, 
                                                boolean __synchronous, 
                                                IceInternal.Functional_GenericCallback1<float[]> __responseCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_findSonByName(name, __ctx, __explicitCtx, __synchronous, 
                                   new IceInternal.Functional_TwowayCallbackArg1<float[]>(__responseCb, __exceptionCb, __sentCb)
                                       {
                                           public final void __completed(Ice.AsyncResult __result)
                                           {
                                               arcPrxHelper.__findSonByName_completed(this, __result);
                                           }
                                       });
    }

    private Ice.AsyncResult begin_findSonByName(String name, 
                                                java.util.Map<String, String> __ctx, 
                                                boolean __explicitCtx, 
                                                boolean __synchronous, 
                                                IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__findSonByName_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__findSonByName_name, __cb);
        try
        {
            __result.prepare(__findSonByName_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(name);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public float[] end_findSonByName(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __findSonByName_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            float[] __ret;
            __ret = sonHelper.read(__is);
            __result.endReadParams();
            return __ret;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __findSonByName_completed(Ice.TwowayCallbackArg1<float[]> __cb, Ice.AsyncResult __result)
    {
    	Generated.Player.arcPrx __proxy = (Generated.Player.arcPrx)__result.getProxy();
        float[] __ret = null;
        try
        {
            __ret = __proxy.end_findSonByName(__result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret);
    }

    private static final String __removeSonById_name = "removeSonById";

    public void removeSonById(int id)
    {
        removeSonById(id, null, false);
    }

    public void removeSonById(int id, java.util.Map<String, String> __ctx)
    {
        removeSonById(id, __ctx, true);
    }

    private void removeSonById(int id, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        end_removeSonById(begin_removeSonById(id, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_removeSonById(int id)
    {
        return begin_removeSonById(id, null, false, false, null);
    }

    public Ice.AsyncResult begin_removeSonById(int id, java.util.Map<String, String> __ctx)
    {
        return begin_removeSonById(id, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_removeSonById(int id, Ice.Callback __cb)
    {
        return begin_removeSonById(id, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_removeSonById(int id, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_removeSonById(id, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_removeSonById(int id, Callback_arc_removeSonById __cb)
    {
        return begin_removeSonById(id, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_removeSonById(int id, java.util.Map<String, String> __ctx, Callback_arc_removeSonById __cb)
    {
        return begin_removeSonById(id, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_removeSonById(int id, 
                                               IceInternal.Functional_VoidCallback __responseCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_removeSonById(id, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_removeSonById(int id, 
                                               IceInternal.Functional_VoidCallback __responseCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                               IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_removeSonById(id, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_removeSonById(int id, 
                                               java.util.Map<String, String> __ctx, 
                                               IceInternal.Functional_VoidCallback __responseCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_removeSonById(id, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_removeSonById(int id, 
                                               java.util.Map<String, String> __ctx, 
                                               IceInternal.Functional_VoidCallback __responseCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                               IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_removeSonById(id, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_removeSonById(int id, 
                                                java.util.Map<String, String> __ctx, 
                                                boolean __explicitCtx, 
                                                boolean __synchronous, 
                                                IceInternal.Functional_VoidCallback __responseCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_removeSonById(id, 
                                   __ctx, 
                                   __explicitCtx, 
                                   __synchronous, 
                                   new IceInternal.Functional_OnewayCallback(__responseCb, __exceptionCb, __sentCb));
    }

    private Ice.AsyncResult begin_removeSonById(int id, 
                                                java.util.Map<String, String> __ctx, 
                                                boolean __explicitCtx, 
                                                boolean __synchronous, 
                                                IceInternal.CallbackBase __cb)
    {
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__removeSonById_name, __cb);
        try
        {
            __result.prepare(__removeSonById_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeInt(id);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public void end_removeSonById(Ice.AsyncResult __iresult)
    {
        __end(__iresult, __removeSonById_name);
    }

    private static final String __removeSonByName_name = "removeSonByName";

    public void removeSonByName(String name)
    {
        removeSonByName(name, null, false);
    }

    public void removeSonByName(String name, java.util.Map<String, String> __ctx)
    {
        removeSonByName(name, __ctx, true);
    }

    private void removeSonByName(String name, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        end_removeSonByName(begin_removeSonByName(name, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_removeSonByName(String name)
    {
        return begin_removeSonByName(name, null, false, false, null);
    }

    public Ice.AsyncResult begin_removeSonByName(String name, java.util.Map<String, String> __ctx)
    {
        return begin_removeSonByName(name, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_removeSonByName(String name, Ice.Callback __cb)
    {
        return begin_removeSonByName(name, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_removeSonByName(String name, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_removeSonByName(name, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_removeSonByName(String name, Callback_arc_removeSonByName __cb)
    {
        return begin_removeSonByName(name, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_removeSonByName(String name, java.util.Map<String, String> __ctx, Callback_arc_removeSonByName __cb)
    {
        return begin_removeSonByName(name, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_removeSonByName(String name, 
                                                 IceInternal.Functional_VoidCallback __responseCb, 
                                                 IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_removeSonByName(name, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_removeSonByName(String name, 
                                                 IceInternal.Functional_VoidCallback __responseCb, 
                                                 IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                 IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_removeSonByName(name, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_removeSonByName(String name, 
                                                 java.util.Map<String, String> __ctx, 
                                                 IceInternal.Functional_VoidCallback __responseCb, 
                                                 IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_removeSonByName(name, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_removeSonByName(String name, 
                                                 java.util.Map<String, String> __ctx, 
                                                 IceInternal.Functional_VoidCallback __responseCb, 
                                                 IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                 IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_removeSonByName(name, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_removeSonByName(String name, 
                                                  java.util.Map<String, String> __ctx, 
                                                  boolean __explicitCtx, 
                                                  boolean __synchronous, 
                                                  IceInternal.Functional_VoidCallback __responseCb, 
                                                  IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                  IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_removeSonByName(name, 
                                     __ctx, 
                                     __explicitCtx, 
                                     __synchronous, 
                                     new IceInternal.Functional_OnewayCallback(__responseCb, __exceptionCb, __sentCb));
    }

    private Ice.AsyncResult begin_removeSonByName(String name, 
                                                  java.util.Map<String, String> __ctx, 
                                                  boolean __explicitCtx, 
                                                  boolean __synchronous, 
                                                  IceInternal.CallbackBase __cb)
    {
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__removeSonByName_name, __cb);
        try
        {
            __result.prepare(__removeSonByName_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(name);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public void end_removeSonByName(Ice.AsyncResult __iresult)
    {
        __end(__iresult, __removeSonByName_name);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static arcPrx checkedCast(Ice.ObjectPrx __obj)
    {
        return checkedCastImpl(__obj, ice_staticId(), arcPrx.class, arcPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static arcPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __ctx, ice_staticId(), arcPrx.class, arcPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static arcPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return checkedCastImpl(__obj, __facet, ice_staticId(), arcPrx.class, arcPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static arcPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __facet, __ctx, ice_staticId(), arcPrx.class, arcPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @return A proxy for this type.
     **/
    public static arcPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        return uncheckedCastImpl(__obj, arcPrx.class, arcPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    public static arcPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return uncheckedCastImpl(__obj, __facet, arcPrx.class, arcPrxHelper.class);
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::Player::arc"
    };

    /**
     * Provides the Slice type ID of this type.
     * @return The Slice type ID.
     **/
    public static String ice_staticId()
    {
        return __ids[1];
    }

    public static void __write(IceInternal.BasicStream __os, arcPrx v)
    {
        __os.writeProxy(v);
    }

    public static arcPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            arcPrxHelper result = new arcPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
