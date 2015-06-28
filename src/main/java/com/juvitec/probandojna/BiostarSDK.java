/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juvitec.probandojna;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;

/**
 *
 * @author RyuujiMD
 */
public class BiostarSDK {

    public static final int BS_SUCCESS = 0;
    public static final int BS_ERR_NOT_FOUND = -306;

    public static final int BS_DEVICE_BIOSTATION = 0;
    public static final int BS_DEVICE_BEPLUS = 1;
    public static final int BS_DEVICE_BIOLITE = 2;
    public static final int BS_DEVICE_XPASS = 3;

    public static final int BEPLUS_CONFIG = 0x50;
    public static final int BEPLUS_CONFIG_SYS_INFO = 0x51;

    public static final int BLN_CONFIG = 0x70;
    public static final int BLN_CONFIG_SYS_INFO = 0x71;

    public static final int BS_CONFIG_SYS_INFO = 0x41;
    public static final int BS_CONFIG_TCPIP = 0x10;

    public static final int NO_ACCESS_GROUP = 0xFD;
    public static final int FULL_ACCESS_GROUP = 0xFE;

    public static final int BS_AUTH_MODE_DISABLED = 0;
    public static final int BS_AUTH_FINGER_ONLY = 1020;
    public static final int BS_AUTH_FINGER_N_PASSWORD = 1021;
    public static final int BS_AUTH_FINGER_OR_PASSWORD = 1022;
    public static final int BS_AUTH_PASS_ONLY = 1023;
    public static final int BS_AUTH_CARD_ONLY = 1024;

    public static final int BE_CARD_VERSION_1 = 0x13;

    // user levels for BioStation
    public static final int BS_USER_ADMIN = 240;
    public static final int BS_USER_NORMAL = 241;

    // security levels for BioStation
    public static final int BS_USER_SECURITY_DEFAULT = 260;
    public static final int BS_USER_SECURITY_LOWER = 261;
    public static final int BS_USER_SECURITY_LOW = 262;
    public static final int BS_USER_SECURITY_NORMAL = 263;
    public static final int BS_USER_SECURITY_HIGH = 264;
    public static final int BS_USER_SECURITY_HIGHER = 265;

    // log events
    public static final int BE_EVENT_SCAN_SUCCESS = 0x58;
    public static final int BE_EVENT_ENROLL_BAD_FINGER = 0x16;
    public static final int BE_EVENT_ENROLL_SUCCESS = 0x17;
    public static final int BE_EVENT_ENROLL_FAIL = 0x18;
    public static final int BE_EVENT_ENROLL_CANCELED = 0x19;

    public static final int BE_EVENT_VERIFY_BAD_FINGER = 0x26;
    public static final int BE_EVENT_VERIFY_SUCCESS = 0x27;
    public static final int BE_EVENT_VERIFY_FAIL = 0x28;
    public static final int BE_EVENT_VERIFY_CANCELED = 0x29;
    public static final int BE_EVENT_VERIFY_NO_FINGER = 0x2a;

    public static final int BE_EVENT_IDENTIFY_BAD_FINGER = 0x36;
    public static final int BE_EVENT_IDENTIFY_SUCCESS = 0x37;
    public static final int BE_EVENT_IDENTIFY_FAIL = 0x38;
    public static final int BE_EVENT_IDENTIFY_CANCELED = 0x39;

    public static final int BE_EVENT_DELETE_BAD_FINGER = 0x46;
    public static final int BE_EVENT_DELETE_SUCCESS = 0x47;
    public static final int BE_EVENT_DELETE_FAIL = 0x48;
    public static final int BE_EVENT_DELETE_ALL_SUCCESS = 0x49;

    public static final int BE_EVENT_VERIFY_DURESS = 0x62;
    public static final int BE_EVENT_IDENTIFY_DURESS = 0x63;

    public static final int BE_EVENT_TAMPER_SWITCH_ON = 0x64;
    public static final int BE_EVENT_TAMPER_SWITCH_OFF = 0x65;

    public static final int BE_EVENT_SYS_STARTED = 0x6a;
    public static final int BE_EVENT_IDENTIFY_NOT_GRANTED = 0x6d;
    public static final int BE_EVENT_VERIFY_NOT_GRANTED = 0x6e;

    public static final int BE_EVENT_IDENTIFY_LIMIT_COUNT = 0x6f;
    public static final int BE_EVENT_IDENTIFY_LIMIT_TIME = 0x70;

    public static final int BE_EVENT_IDENTIFY_DISABLED = 0x71;
    public static final int BE_EVENT_IDENTIFY_EXPIRED = 0x72;

    public static final int BE_EVENT_APB_FAIL = 0x73;
    public static final int BE_EVENT_COUNT_LIMIT = 0x74;
    public static final int BE_EVENT_TIME_INTERVAL_LIMIT = 0x75;
    public static final int BE_EVENT_INVALID_AUTH_MODE = 0x76;
    public static final int BE_EVENT_EXPIRED_USER = 0x77;
    public static final int BE_EVENT_NOT_GRANTED = 0x78;

    public static final int BE_EVENT_DETECT_INPUT0 = 0x54;
    public static final int BE_EVENT_DETECT_INPUT1 = 0x55;

    public static final int BE_EVENT_TIMEOUT = 0x90;

    public static final int BS_EVENT_RELAY_ON = 0x80;
    public static final int BS_EVENT_RELAY_OFF = 0x81;

    public static final int BE_EVENT_DOOR0_OPEN = 0x82;
    public static final int BE_EVENT_DOOR1_OPEN = 0x83;
    public static final int BE_EVENT_DOOR0_CLOSED = 0x84;
    public static final int BE_EVENT_DOOR1_CLOSED = 0x85;

    public static final int BE_EVENT_DOOR0_FORCED_OPEN = 0x86;
    public static final int BE_EVENT_DOOR1_FORCED_OPEN = 0x87;

    public static final int BE_EVENT_DOOR0_HELD_OPEN = 0x88;
    public static final int BE_EVENT_DOOR1_HELD_OPEN = 0x89;

    public static final int BE_EVENT_DOOR0_RELAY_ON = 0x8A;
    public static final int BE_EVENT_DOOR1_RELAY_ON = 0x8B;

    public static final int BE_EVENT_INTERNAL_INPUT0 = 0xA0;
    public static final int BE_EVENT_INTERNAL_INPUT1 = 0xA1;
    public static final int BE_EVENT_SECONDARY_INPUT0 = 0xA2;
    public static final int BE_EVENT_SECONDARY_INPUT1 = 0xA3;

    public static final int BE_EVENT_SIO0_INPUT0 = 0xB0;
    public static final int BE_EVENT_SIO0_INPUT1 = 0xB1;
    public static final int BE_EVENT_SIO0_INPUT2 = 0xB2;
    public static final int BE_EVENT_SIO0_INPUT3 = 0xB3;

    public static final int BE_EVENT_SIO1_INPUT0 = 0xB4;
    public static final int BE_EVENT_SIO1_INPUT1 = 0xB5;
    public static final int BE_EVENT_SIO1_INPUT2 = 0xB6;
    public static final int BE_EVENT_SIO1_INPUT3 = 0xB7;

    public static final int BE_EVENT_SIO2_INPUT0 = 0xB8;
    public static final int BE_EVENT_SIO2_INPUT1 = 0xB9;
    public static final int BE_EVENT_SIO2_INPUT2 = 0xBA;
    public static final int BE_EVENT_SIO2_INPUT3 = 0xBB;

    public static final int BE_EVENT_SIO3_INPUT0 = 0xBC;
    public static final int BE_EVENT_SIO3_INPUT1 = 0xBD;
    public static final int BE_EVENT_SIO3_INPUT2 = 0xBE;
    public static final int BE_EVENT_SIO3_INPUT3 = 0xBF;

    public static final int BE_EVENT_LOCKED = 0xC0;
    public static final int BE_EVENT_UNLOCKED = 0xC1;

    public static final int BE_EVENT_TIME_SET = 0xD2;
    public static final int BE_EVENT_SOCK_CONN = 0xD3;
    public static final int BE_EVENT_SOCK_DISCONN = 0xD4;
    public static final int BE_EVENT_SERVER_SOCK_CONN = 0xD5;
    public static final int BE_EVENT_SERVER_SOCK_DISCONN = 0xD6;
    public static final int BE_EVENT_LINK_CONN = 0xD7;
    public static final int BE_EVENT_LINK_DISCONN = 0xD8;
    public static final int BE_EVENT_INIT_IP = 0xD9;
    public static final int BE_EVENT_INIT_DHCP = 0xDA;
    public static final int BE_EVENT_DHCP_SUCCESS = 0xDB;

    public class BSLogRecord extends Structure {

        public byte eventType;
        public byte subEvent;
        public short tnaEvent;
        public int eventTime;
        public int userID;
        public int reserved;
    }

    public class BSDisplayConfig extends Structure {
        /*
         language
         BS_UI_LANG_KOREAN 
         BS_UI_LANG_ENGLISH 
         BS_UI_LANG_CUSTOM 
         background
         BS_UI_BG_LOGO – shows logo image. 
         BS_UI_BG_NOTICE – shows notice message. 
         BS_UI_BG_PICTURE – shows slide show. 
         bottomInfo
         BS_UI_INFO_NONE – shows nothing. 
         BS_UI_INFO_TIME – shows current time. 
         msgTimeout  
         BS_MSG_TIMEOUT_500MS – 0.5 sec 
         BS_MSG_TIMEOUT_1000MS – 1 sec 
         BS_MSG_TIMEOUT_2000MS – 2 sec 
         BS_MSG_TIMEOUT_3000MS – 3 sec 
         BS_MSG_TIMEOUT_4000MS – 4 sec 
         BS_MSG_TIMEOUT_5000MS – 5 sec 
         dateType
         BS_UI_DATE_TYPE_AM – DD/MM 
         BS_UI_DATE_TYPE_EU – MM/DD 
         disableAuthResult  If it is true, BioStation dosen’t display pop-up 
         window which is result of the authentication.
         */

        public int language;
        public int background;
        public int bottomInfo;
        public int reserved1;
        public int timeout; // menu timeout in seconds, 0 for infinite 
        public int volume; // 0(mute) ~ 100 
        public int msgTimeout;
        public int usePrivateAuth; // private authentication : 1 – use, 0 – don’t use 
        public int dateType;
        public int disableAuthResult;
        public int reserved2[]; //[6]
    }

    

//    public class BESysInfoDataBLN extends Structure {
//
//        public int magicNo;
//        public int version;
//        public int timestamp;
//        public int checksum;
//        public int[] headerReserved;
//
//        public int ID;
//        public byte[] macAddr;
//        public byte[] boardVer;
//        public byte[] firmwareVer;
//        public byte[] productName;
//        public int language;
//        public int[] reserved;
//
//        @Override
//        public String toString() {
//            return "BESysInfoDataBLN{" + "magicNo=" + magicNo + ", version=" + version + ", timestamp=" + timestamp + ", checksum=" + checksum + ", headerReserved=" + headerReserved + ", ID=" + ID + ", macAddr=" + macAddr + ", boardVer=" + boardVer + ", firmwareVer=" + firmwareVer + ", productName=" + productName + ", language=" + language + ", reserved=" + reserved + '}';
//        }
//
//    }

    public interface BSSDK extends Library {
        public class BEConfigDataBLN extends Structure {
            public static class ByReference extends BEConfigDataBLN implements Structure.ByReference {}
        // header
        public int magicNo;
        public int version;
        public int timestamp;
        public int checksum;
        public int[] headerReserved = new int[4];

        // operation mode
        private static final int MAX_OP_MODE = 4;
        public int[] opMode = new int[MAX_OP_MODE];
        public int[] opModeSchedule = new int[MAX_OP_MODE];
        public byte[] opDualMode = new byte[MAX_OP_MODE];
        public byte[] opReserved1 = new byte[3];
        public int opModePerUser;
        public int[] identificationMode = new int[3];
        public int[] identificationModeSchedule = new int[3];
        public int[] opReserved2 = new int[1];

        // ip
        public boolean useDHCP;
        public int ipAddr;
        public int gateway;
        public int subnetMask;
        public int serverIpAddr;
        public int port;
        public boolean useServer;
        public boolean synchTime;
        public int[] ipReserved = new int[6];

        // fingerprint
        public int imageQuality;
        public int securityLevel;
        public int fastMode;
        public int fingerReserved1;
        public int timeout; // 1 ~ 20 sec
        public int matchTimeout; // Infinite(0) ~ 10 sec
        public int templateType;
        public int fakeDetection;
        public boolean useServerMatching;
        public boolean useCheckDuplicate;
        public int[] fingerReserved2 = new int[7];

        // padding
        public int[] padding = new int[3930];

        @Override
        public String toString() {
            return "BEConfigDataBLN{" + "magicNo=" + magicNo + ", version=" + version + ", timestamp=" + timestamp + ", checksum=" + checksum + ", headerReserved=" + headerReserved + ", opMode=" + opMode + ", opModeSchedule=" + opModeSchedule + ", opDualMode=" + opDualMode + ", opReserved1=" + opReserved1 + ", opModePerUser=" + opModePerUser + ", identificationMode=" + identificationMode + ", identificationModeSchedule=" + identificationModeSchedule + ", opReserved2=" + opReserved2 + ", useDHCP=" + useDHCP + ", ipAddr=" + ipAddr + ", gateway=" + gateway + ", subnetMask=" + subnetMask + ", serverIpAddr=" + serverIpAddr + ", port=" + port + ", useServer=" + useServer + ", synchTime=" + synchTime + ", ipReserved=" + ipReserved + ", imageQuality=" + imageQuality + ", securityLevel=" + securityLevel + ", fastMode=" + fastMode + ", fingerReserved1=" + fingerReserved1 + ", timeout=" + timeout + ", matchTimeout=" + matchTimeout + ", templateType=" + templateType + ", fakeDetection=" + fakeDetection + ", useServerMatching=" + useServerMatching + ", useCheckDuplicate=" + useCheckDuplicate + ", fingerReserved2=" + fingerReserved2 + ", padding=" + padding + '}';
        }

    }

        public class BESysInfoDataBLN extends Structure {
            public static class ByReference extends BESysInfoDataBLN implements Structure.ByReference {}

            public int magicNo;
            public int version;
            public int timestamp;
            public int checksum;
            public int[] headerReserved = new int[4];

            public int ID;
            public byte[] macAddr = new byte[8];
            public byte[] boardVer = new byte[16];
            public byte[] firmwareVer = new byte[16];
            public byte[] productName= new byte[32];
            public int language;
            public int[] reserved = new int[31];

            @Override
            public String toString() {
                return "BESysInfoDataBLN{" + "magicNo=" + magicNo + ", version=" + version + ", timestamp=" + timestamp + ", checksum=" + checksum + ", headerReserved=" + headerReserved + ", ID=" + ID + ", macAddr=" + macAddr + ", boardVer=" + boardVer + ", firmwareVer=" + firmwareVer + ", productName=" + productName + ", language=" + language + ", reserved=" + reserved + '}';
            }

        }

        BSSDK INSTANCE = (BSSDK) Native.loadLibrary((Platform.isWindows() ? "BS_SDK" : "c"),
                BSSDK.class);

        int BS_InitSDK();

        int BS_OpenInternalUDP(IntByReference mHandle);

        int BS_SearchDeviceInLAN(int handle, IntByReference numOfDevice, int[] deviceIDs, int[] deviceTypes, int[] readerAddrs);

        int BS_GetDeviceID(int handle, IntByReference deviceId, IntByReference deviceType);

        int BS_SetDeviceID(int handle, int deviceID, int deviceType);

        int BS_ReadConfig(int handle, int configType, IntByReference configSize, IntByReference data);

        int BS_OpenSocket(String ipAddr, int port, IntByReference handle);

        int BS_OpenSocketEx(String deviceipAddr, int port, String hostipAddr, IntByReference handle);

        int BS_CloseSocket(int handle);

//        int BS_ReadConfig( int handle, int configType, IntByReference size, BEConfigDataBLN.ByReference data );
        int BS_ReadConfig(int handle, int configType, IntByReference size, Structure.ByReference data);
    }
}
