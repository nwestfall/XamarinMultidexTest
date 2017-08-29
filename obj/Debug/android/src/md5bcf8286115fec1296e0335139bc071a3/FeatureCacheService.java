package md5bcf8286115fec1296e0335139bc071a3;


public class FeatureCacheService
	extends mono.android.app.IntentService
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onHandleIntent:(Landroid/content/Intent;)V:GetOnHandleIntent_Landroid_content_Intent_Handler\n" +
			"";
		mono.android.Runtime.register ("Tyler.Drive.Http.Services.FeatureCacheService, Tyler.Drive.Http, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", FeatureCacheService.class, __md_methods);
	}


	public FeatureCacheService (java.lang.String p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == FeatureCacheService.class)
			mono.android.TypeManager.Activate ("Tyler.Drive.Http.Services.FeatureCacheService, Tyler.Drive.Http, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "System.String, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0 });
	}


	public FeatureCacheService () throws java.lang.Throwable
	{
		super ();
		if (getClass () == FeatureCacheService.class)
			mono.android.TypeManager.Activate ("Tyler.Drive.Http.Services.FeatureCacheService, Tyler.Drive.Http, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onHandleIntent (android.content.Intent p0)
	{
		n_onHandleIntent (p0);
	}

	private native void n_onHandleIntent (android.content.Intent p0);

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
