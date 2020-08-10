package com.qiao.serialport.utils;



public interface Consts {

    public static class  Utils{
        public static final String ACTION=".SerialPort.MessageService";
        public static String packageName="";
        public static String PERMISSION=".SerialPort.Permission.REMOTE_SERVICE_PERMISSION";
        public static String PATH="SerialPort_PATH";
        public static String BAUDRATE="SerialPort_BAUDRATE";
        public static String STOPBITS="SerialPort_STOPBITS";
        public static String DATABITS="SerialPort_DATABITS";
        public static String PARITY="SerialPort_PARITY";
        public static String FLOWCON="SerialPort_FLOWCON";
        public static String FLAGS="SerialPort_FLAGS";
        public static String path="dev/ttyS3";
        public static int baudrate=19200;
        public static int stopBits=1;
        public static int dataBits=8;
        public static int parity=0;
        public static int flowCon=0;
        public static int flags=0;
    }
}
