package ru.cse.proxysorter.Message;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class Request17 extends Request4All {



    public static final byte MESSAGE_CODE=Telegram.TELEGA17;
    public static final int MESSAGE_LENGHT=9;

    private  short smlSTX            = 0x02;
    private  short Command           = MESSAGE_CODE;
    private byte ExitNumber          = 0x31;
    private byte[] Reserv            = new byte[5];
    private  short smlETX            = 0x03;

    public byte getExitNumber() {
        return ExitNumber;
    }

    public  short getCommand() {
        return Command;
    }
    /**
     * @return the smlSTX
     */
    public short getSmlSTX() {
        return smlSTX;
    }

    /**
     * @param ExitNumber the ExitNumber to set
     */
    public void setExitNumber(byte ExitNumber) {
        this.ExitNumber = ExitNumber;
    }

    /**
     * @return the Reserv
     */
    public byte[] getReserv() {
        return Reserv;
    }

    /**
     * @param Reserv the Reserv to set
     */
    public void setReserv(byte[] Reserv) {
        this.Reserv = Reserv;
    }

    /**
     * @return the smlETX
     */
    public short getSmlETX() {
        return smlETX;
    }    

    @Override
    public ByteBuf ToByte() {
        ByteBuf buf = Unpooled.buffer(MESSAGE_LENGHT);
        buf.writeByte(getSmlSTX());
        buf.writeByte(getCommand());
        buf.writeByte(getExitNumber());
        buf.writeBytes(getReserv());
        buf.writeByte(getSmlETX());
        return buf;
    }

    @Override
    public void FromByte(ByteBuf msg) {

        smlSTX          = msg.readByte();
        Command         = msg.readByte();
        ExitNumber      = msg.readByte();
        msg.readBytes(Reserv);
        smlETX          = msg.readUnsignedByte();
    }
    @Override
    public String toString() {
        String NewString = " ExitNumber->"+ExitNumber;
        return super.toString()+NewString;
    }     
    
}
