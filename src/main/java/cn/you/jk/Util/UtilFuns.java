package cn.you.jk.Util;

public class UtilFuns {

    public static boolean isNotEmpty(String str){  
        try{  
          if(str==null || str.equals("null") || str.equals("")){  
              return false;  
          }  
          return true;  
        }catch(Exception e){  
          return true;  
        }  
      }  
      
      
      public static boolean isNotEmpty(Object obj){  
        try{  
          if(obj==null || obj.toString().equals("null") || obj.toString().equals("")){  
              return false;  
          }  
          return true;  
        }catch(Exception e){  
          return true;  
        }  
      }  
}
