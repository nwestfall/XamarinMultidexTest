package md5649c99a04d16b49e483268767d822a8b;


public abstract class AppCompatActivityBase
	extends android.support.v7.app.AppCompatActivity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onResume:()V:GetOnResumeHandler\n" +
			"";
		mono.android.Runtime.register ("JimBobBennett.MvvmLight.AppCompat.AppCompatActivityBase, JimBobBennett.MvvmLight.AppCompat, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", AppCompatActivityBase.class, __md_methods);
	}


	public AppCompatActivityBase () throws java.lang.Throwable
	{
		super ();
		if (getClass () == AppCompatActivityBase.class)
			mono.android.TypeManager.Activate ("JimBobBennett.MvvmLight.AppCompat.AppCompatActivityBase, JimBobBennett.MvvmLight.AppCompat, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onResume ()
	{
		n_onResume ();
	}

	private native void n_onResume ();

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
