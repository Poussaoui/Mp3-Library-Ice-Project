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

public interface _arcOperationsNC
{
    float[] findSonByName(String name);

    float[] findSonById(int id);

    void addSon(int id, String name, float[] ms);

    void removeSonByName(String name);

    void removeSonById(int id);
}
