/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter.Message;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

/**
 *
 * @author Oleynik
 */
public class Response12 extends Request4All {

    public static final short MESSAGE_CODE=Telegram.TELEGA12;
    public static final int MESSAGE_LENGHT=8;

    
    private short Command    = MESSAGE_CODE;
    public short msgSTX      = 0x02;
    public short msgETX      = 0x03;
    private int codeProduct = 1000;
    private short ExitNumber = 0x04;


    public short getCommand() {
        return Command;
    }

    /**
     * @param Command the Command to set
     */
    public void setCommand(short Command) {
        this.Command = Command;
    }

    /**
     * @return the codeProduct
     */
    public int getCodeProduct() {
        return codeProduct;
    }

    /**
     * @param codeProduct the codeProduct to set
     */
    public void setCodeProduct(int codeProduct) {
        this.codeProduct = codeProduct;
    }

    /**
     * @return the ExitNumber
     */
    public short getExitNumber() {
        return ExitNumber;
    }

    /**
     * @param ExitNumber the ExitNumber to set
     */
    public void setExitNumber(short ExitNumber) {
        this.ExitNumber = ExitNumber;
    }
      
    @Override
    public ByteBuf ToByte() {

//        byte[] answer = new byte[]{0x02,0x12,0x43,0x66,0x28,0x03};
//        msgSTX  = 0x02;
//        setCommand((byte) 0x12);
//        setCodeProduct((short) 9999);
//        setExitNumber((byte) 40);
//        msgETX      = 0x03;

        ByteBuf buf = Unpooled.buffer(MESSAGE_LENGHT);
        buf.writeByte(msgSTX);
        buf.writeByte(MESSAGE_CODE);
        buf.writeInt(codeProduct);
        buf.writeByte(ExitNumber);
        buf.writeByte(msgETX);
        

        return  buf;
    }

    @Override
    public void FromByte(ByteBuf msg) {

    }
    
    @Override
    public String toString() {
        String NewString = " codeProduct->"+codeProduct+" ExitNumber->"+ExitNumber;
        return super.toString()+NewString;
    }      
}
