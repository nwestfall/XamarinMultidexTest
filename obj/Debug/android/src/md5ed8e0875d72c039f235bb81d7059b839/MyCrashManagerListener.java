package md5ed8e0875d72c039f235bb81d7059b839;


public class MyCrashManagerListener
	extends net.hockeyapp.android.CrashManagerListener
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getUserID:()Ljava/lang/String;:GetGetUserIDHandler\n" +
			"n_getContact:()Ljava/lang/String;:GetGetContactHandler\n" +
			"n_getDescription:()Ljava/lang/String;:GetGetDescriptionHandler\n" +
			"n_includeDeviceIdentifier:()Z:GetIncludeDeviceIdentifierHandler\n" +
			"n_includeDeviceData:()Z:GetIncludeDeviceDataHandler\n" +
			"n_includeThreadDetails:()Z:GetIncludeThreadDetailsHandler\n" +
			"n_shouldAutoUploadCrashes:()Z:GetShouldAutoUploadCrashesHandler\n" +
			"";
		mono.android.Runtime.register ("Tyler.Drive.Logging.MyCrashManagerListener, Tyler.Drive.Logging, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MyCrashManagerListener.class, __md_methods);
	}


	public MyCrashManagerListener () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MyCrashManagerListener.class)
			mono.android.TypeManager.Activate ("Tyler.Drive.Logging.MyCrashManagerListener, Tyler.Drive.Logging, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public java.lang.String getUserID ()
	{
		return n_getUserID ();
	}

	private native java.lang.String n_getUserID ();


	public java.lang.String getContact ()
	{
		return n_getContact ();
	}

	private native java.lang.String n_getContact ();


	public java.lang.String getDescription ()
	{
		return n_getDescription ();
	}

	private native java.lang.String n_getDescription ();


	public boolean includeDeviceIdentifier ()
	{
		return n_includeDeviceIdentifier ();
	}

	private native boolean n_includeDeviceIdentifier ();


	public boolean includeDeviceData ()
	{
		return n_includeDeviceData ();
	}

	private native boolean n_includeDeviceData ();


	public boolean includeThreadDetails ()
	{
		return n_includeThreadDetails ();
	}

	private native boolean n_includeThreadDetails ();


	public boolean shouldAutoUploadCrashes ()
	{
		return n_shouldAutoUploadCrashes ();
	}

	private native boolean n_shouldAutoUploadCrashes ();

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
