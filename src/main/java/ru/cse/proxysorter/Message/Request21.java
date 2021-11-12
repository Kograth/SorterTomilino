package ru.cse.proxysorter.Message;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public  class Request21 extends Request4All {

    //Общие данные класса для правильного декодирования
    public static final byte MESSAGE_CODE=Telegram.TELEGA21;
    public static final int MESSAGE_LENGHT=80;

    private short smlSTX        = 0x02;
    private short COMMAND       = 0x21;
    private short codePLK         = 0;
    private int Status          = 0;
    private byte[] ChyteStatus  = new byte[67];
    private byte[] reserve       = new byte[2];
    private short smlETX           = 0x03;

    public int getStatus() {
        return Status;
    }

    public short getcodePLK() {
        return codePLK;
    }

    public short getCommand() {
        return  COMMAND;
    }

    public byte[] getChyteStatus() {
        return ChyteStatus;
    }

    public byte[] getReserv() {
        return reserve;
    }

    @Override
    public ByteBuf ToByte() {

        ByteBuf buf = Unpooled.buffer(MESSAGE_LENGHT);
        buf.writeByte(smlSTX);
        buf.writeByte(MESSAGE_CODE);
        buf.writeInt(codePLK);
        buf.writeInt(Status);
        buf.writeBytes(getChyteStatus());
        buf.writeBytes(getReserv());
        buf.writeByte(smlETX);

        return buf;

    }

    @Override
    public String toString() {
        String NewString = " Status-------->"+Status+" PLK-->"+codePLK;
        return super.toString()+NewString;
    }

    @Override
    public void FromByte(ByteBuf msg) {



        smlSTX      = msg.readUnsignedByte(); // <STX>
        COMMAND     = msg.readUnsignedByte(); // <Команда должна быть равна 21>
        codePLK     = msg.readShort();     // код продукта ПЛК
        Status      = msg.readInt();
        byte[] Array = new byte[67];
        msg.readBytes(Array);
        ChyteStatus = Array;
        byte[] Array2 = new byte[2];
        msg.readBytes(Array2);
        reserve = Array2;
        smlETX      = msg.readUnsignedByte();
        //<ETX>


    }
}
