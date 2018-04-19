package com.example.telephonyeg;


import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.Html;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity 
{
	private TelephonyManager teleMgr = null;
	
	String ModelNumber, Board, Brand, Display, FingerPrint, ID, TAGS, Type, 
	AndroidVersion, APILevel, CodeName, INCREMENTAL;
   // private MyPhoneStateListener myListener = null;
   // private String logText = "";
	TextView tv, tv1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		tv =(TextView)findViewById(R.id.textView1);
		
		teleMgr =(TelephonyManager)getSystemService
				(Context.TELEPHONY_SERVICE);
		
		tv.setText(teleMgr.getSubscriberId().toString());
		//myListener = new MyPhoneStateListener();
		
		ModelNumber = android.os.Build.MODEL;
		Board = android.os.Build.BOARD;
		Brand = android.os.Build.BRAND;
		Display = android.os.Build.DISPLAY;
		FingerPrint = android.os.Build.FINGERPRINT;
		ID = android.os.Build.ID;
		TAGS =android.os.Build.TAGS;
		Type = android.os.Build.TYPE;
		
		AndroidVersion = android.os.Build.VERSION.RELEASE;
		APILevel = android.os.Build.VERSION.SDK;
		CodeName = android.os.Build.VERSION.CODENAME;
		
		tv1 =(TextView)findViewById(R.id.textView2);
		
		tv1.setText(Html.fromHtml("Phone Type :"+
				"<br/><font color = 'red';>Model Number : </font></font>" + ModelNumber 
				+ "<br/><font color = 'red';>Board : </font>" + Board
				+ "<br/><font color = 'red';>Brand : </font>" + Brand
				+ "<br/><font color = 'red';>Display : </font>" + Display
				+ "<br/><font color = 'red';>FingerPrint : </font>" + FingerPrint
				+ "<br/><font color = 'red';>ID : </font>" + ID
				+ "<br/><font color = 'red';>TAGS : </font>" + TAGS
				+ "<br/><font color = 'red';>Type : </font>" + Type        		
				        		
				+ "<br/>"
				
				+ "<br/><font color = 'red';>Android Version : </font>" + AndroidVersion
				+ "<br/><font color = 'red';>API Level : </font>" + APILevel
				+ "<br/><font color = 'red';>CodeName : </font>" + CodeName));
		 
		
		}

	/*@Override
	protected void onPause() 
	{
		super.onPause();
		teleMgr.listen(myListener, PhoneStateListener.LISTEN_NONE);
	}

	@Override
	protected void onResume() 
	{
		super.onResume();
		teleMgr.listen(myListener, PhoneStateListener.LISTEN_CALL_STATE);
	}
	
	public void	 doClick(View target) 
	{
		Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("924586313"));
		startActivity(in);
	}

	class MyPhoneStateListener extends PhoneStateListener
	{

		@Override
		public void onCallStateChanged(int state, String incomingNumber) 
		{
			super.onCallStateChanged(state, incomingNumber);
			
			switch(state)
			{
				case TelephonyManager.CALL_STATE_IDLE:
				logText = "Call state idle.....incoming number is ["+incomingNumber
				+"]\n" +logText;
				break;
				
				case TelephonyManager.CALL_STATE_RINGING:
					logText = "Call state ringing.....incoming number is ["+incomingNumber
					+"]\n" +logText;
					break;
					
				case TelephonyManager.CALL_STATE_OFFHOOK :
					logText = "Call state Offhook.....incoming number is ["+incomingNumber
					+"]\n" +logText;
					break;
					
				default:
					logText = "Call state ["+state+"] incoming nos is ["+incomingNumber
					 +"]\n"+logText;
					break;
					}
				tv.setText(logText);
		}
		
	}*/

}