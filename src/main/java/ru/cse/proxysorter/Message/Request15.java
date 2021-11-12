package ru.cse.proxysorter.Message;

import io.netty.buffer.ByteBuf;

public class Request15 extends Request4All {
    public static final byte MESSAGE_CODE=Telegram.TELEGA15;
    public static final int MESSAGE_LENGHT=9;

    private short smlSTX            = 0x02;
    private short Command           = 0x15;
    private byte ExitNumber         = 0x31;
    private short NumberManualPack  = 0x00;
    private short smlETX            = 0x03;
    private String Barcode          = "007";

    public short getCommand() {
        return Command;
    }

    public String getBarcode() {
        return  Barcode;
    }

    @Override
    public ByteBuf ToByte() {
        return null;
    }

    @Override
    public void FromByte(ByteBuf msg) {
        smlSTX          = msg.readUnsignedByte();
        Command         = msg.readUnsignedByte();
        ExitNumber      = msg.readByte();
        NumberManualPack= msg.readUnsignedByte();
        smlETX          = msg.readUnsignedByte();

    }
    @Override
    public String toString() {
        String NewString = " ExitNumber->"+ExitNumber+" NumberManualPack->"+NumberManualPack;
        return super.toString()+NewString;
    }     
}
