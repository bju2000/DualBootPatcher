// automatically generated, do not modify

package mbtool.daemon.v3;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class MbGetBootedRomIdRequest extends Table {
  public static MbGetBootedRomIdRequest getRootAsMbGetBootedRomIdRequest(ByteBuffer _bb) { return getRootAsMbGetBootedRomIdRequest(_bb, new MbGetBootedRomIdRequest()); }
  public static MbGetBootedRomIdRequest getRootAsMbGetBootedRomIdRequest(ByteBuffer _bb, MbGetBootedRomIdRequest obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public MbGetBootedRomIdRequest __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }


  public static void startMbGetBootedRomIdRequest(FlatBufferBuilder builder) { builder.startObject(0); }
  public static int endMbGetBootedRomIdRequest(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

