package com.lamfire.qqwryparser;

import com.lamfire.logger.Logger;
import com.lamfire.utils.ClassLoaderUtils;

import java.io.File;

public class QQwryUtils {
	static final Logger LOGGER = Logger.getLogger(QQwryUtils.class);
	private static QQwryParser parser;
	private static File qqwryFile = null;
	
	private synchronized static QQwryParser getQQwryParser(){
		if(parser != null){
			return parser;
		}
		
		if(qqwryFile == null){
			qqwryFile = new File(ClassLoaderUtils.getResource("qqwry.dat", QQwryUtils.class).getPath());
		}

		try{
			parser = new QQwryParser(qqwryFile);
		}catch(Exception e){
			LOGGER.error(e);
			parser = null;
		}
		
		return parser;
	}
	
	public static void setQQwryFile(File file){
		qqwryFile = file;
        if(parser != null){
            parser.close();
            parser = null;
        }
	}
	
	public static AddrInfo getAddrInfo(String ip){
		QQwryParser parser =  getQQwryParser();
		if(parser != null){
			return parser.getAddrInfo(ip);
		}
		return null;
	}
	
	public static String getProvider(String ip){
		return getAddrInfo(ip).getProvider();
	}

    public static String getCountry(String ip){
        return getAddrInfo(ip).getCountry();
    }

    public static String getProvince(String ip){
        return getAddrInfo(ip).getProvince();
    }

    public static String getCity(String ip){
        return getAddrInfo(ip).getCity();
    }



}
