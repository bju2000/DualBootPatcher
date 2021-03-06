// automatically generated, do not modify

package mbtool.daemon.v3;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FileOpenResponse extends Table {
  public static FileOpenResponse getRootAsFileOpenResponse(ByteBuffer _bb) { return getRootAsFileOpenResponse(_bb, new FileOpenResponse()); }
  public static FileOpenResponse getRootAsFileOpenResponse(ByteBuffer _bb, FileOpenResponse obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public FileOpenResponse __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public boolean success() { int o = __offset(4); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public String errorMsg() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer errorMsgAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public int id() { int o = __offset(8); return o != 0 ? bb.getInt(o + bb_pos) : 0; }

  public static int createFileOpenResponse(FlatBufferBuilder builder,
      boolean success,
      int error_msgOffset,
      int id) {
    builder.startObject(3);
    FileOpenResponse.addId(builder, id);
    FileOpenResponse.addErrorMsg(builder, error_msgOffset);
    FileOpenResponse.addSuccess(builder, success);
    return FileOpenResponse.endFileOpenResponse(builder);
  }

  public static void startFileOpenResponse(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addSuccess(FlatBufferBuilder builder, boolean success) { builder.addBoolean(0, success, false); }
  public static void addErrorMsg(FlatBufferBuilder builder, int errorMsgOffset) { builder.addOffset(1, errorMsgOffset, 0); }
  public static void addId(FlatBufferBuilder builder, int id) { builder.addInt(2, id, 0); }
  public static int endFileOpenResponse(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

