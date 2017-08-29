package md5ed8e0875d72c039f235bb81d7059b839;


public class MyUpdateManagerListener
	extends net.hockeyapp.android.UpdateManagerListener
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBuildExpired:()Z:GetOnBuildExpiredHandler\n" +
			"n_onNoUpdateAvailable:()V:GetOnNoUpdateAvailableHandler\n" +
			"n_onUpdateAvailable:()V:GetOnUpdateAvailableHandler\n" +
			"n_onUpdateAvailable:(Lorg/json/JSONArray;Ljava/lang/String;)V:GetOnUpdateAvailable_Lorg_json_JSONArray_Ljava_lang_String_Handler\n" +
			"n_onUpdatePermissionsNotGranted:()V:GetOnUpdatePermissionsNotGrantedHandler\n" +
			"";
		mono.android.Runtime.register ("Tyler.Drive.Logging.MyUpdateManagerListener, Tyler.Drive.Logging, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MyUpdateManagerListener.class, __md_methods);
	}


	public MyUpdateManagerListener () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MyUpdateManagerListener.class)
			mono.android.TypeManager.Activate ("Tyler.Drive.Logging.MyUpdateManagerListener, Tyler.Drive.Logging, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public boolean onBuildExpired ()
	{
		return n_onBuildExpired ();
	}

	private native boolean n_onBuildExpired ();


	public void onNoUpdateAvailable ()
	{
		n_onNoUpdateAvailable ();
	}

	private native void n_onNoUpdateAvailable ();


	public void onUpdateAvailable ()
	{
		n_onUpdateAvailable ();
	}

	private native void n_onUpdateAvailable ();


	public void onUpdateAvailable (org.json.JSONArray p0, java.lang.String p1)
	{
		n_onUpdateAvailable (p0, p1);
	}

	private native void n_onUpdateAvailable (org.json.JSONArray p0, java.lang.String p1);


	public void onUpdatePermissionsNotGranted ()
	{
		n_onUpdatePermissionsNotGranted ();
	}

	private native void n_onUpdatePermissionsNotGranted ();

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
