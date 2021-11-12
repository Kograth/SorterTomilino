package ru.cse.proxysorter.Message;

import io.netty.buffer.ByteBuf;

public class Request13  extends Request4All{
    public static final byte MESSAGE_CODE=Telegram.TELEGA13;
    public static final int MESSAGE_LENGHT=9;

    private short smlSTX            = 0x02;
    private short Command           = 0x13;
    private int codeProduct         = 0;
    private byte ExitNumber         = 0x31;
    private short SourceSort        = 0x00;
    private short smlETX            = 0x03;


    public int getCodeProduct () {
        return codeProduct;
    }

    public byte getExitNumber() {
        return ExitNumber;
    }

    public short getSource () {
        return SourceSort;
    }

    public short getCommand() {
        return  Command;
    }

    @Override
    public ByteBuf ToByte() {
        return null;
    }

    @Override
    public void FromByte(ByteBuf msg) {

        smlSTX          = msg.readUnsignedByte();
        Command         = msg.readUnsignedByte();
        codeProduct     = msg.readInt();
        ExitNumber      = msg.readByte();
        SourceSort      = msg.readUnsignedByte();
        smlETX          = msg.readUnsignedByte();

    }
    @Override
    public String toString() {
        String NewString = " codeProduct->"+codeProduct+" ExitNumber->"+ExitNumber+" SourceSort->"+SourceSort;
        return super.toString()+NewString;
    }    
}
