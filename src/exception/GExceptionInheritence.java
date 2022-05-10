package exception;

import java.io.NotSerializableException;

public class GExceptionInheritence {
	public static void main(String[] args) {
			//Won't compile as FileNotFoundException extends IOException
//			try {
//				throw new IOException();
//			} catch (IOException | FileNotFoundException e) {
//			}
			
			//Since NotSerializableException is a subclass it is already covered by IOException
//			try {
//				throw new IOException();
//			} catch (IOException | NotSerializableException e) {
//			}
			
			try {
				throw new Exception() ;
			} catch(NumberFormatException e){
			} catch (IllegalArgumentException e) {
			} catch (Exception e) {
			}
		}
}
