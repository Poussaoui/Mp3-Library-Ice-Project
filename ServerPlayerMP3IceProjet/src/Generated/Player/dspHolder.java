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

public final class dspHolder extends Ice.ObjectHolderBase<dsp>
{
    public
    dspHolder()
    {
    }

    public
    dspHolder(dsp value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof dsp)
        {
            value = (dsp)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return _dspDisp.ice_staticId();
    }
}
