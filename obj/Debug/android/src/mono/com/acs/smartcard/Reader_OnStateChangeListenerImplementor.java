package mono.com.acs.smartcard;


public class Reader_OnStateChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.acs.smartcard.Reader.OnStateChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onStateChange:(III)V:GetOnStateChange_IIIHandler:Com.Acs.Smartcard.Reader/IOnStateChangeListenerInvoker, Acs.Smartcard\n" +
			"";
		mono.android.Runtime.register ("Com.Acs.Smartcard.Reader+IOnStateChangeListenerImplementor, Acs.Smartcard, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", Reader_OnStateChangeListenerImplementor.class, __md_methods);
	}


	public Reader_OnStateChangeListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == Reader_OnStateChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Acs.Smartcard.Reader+IOnStateChangeListenerImplementor, Acs.Smartcard, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onStateChange (int p0, int p1, int p2)
	{
		n_onStateChange (p0, p1, p2);
	}

	private native void n_onStateChange (int p0, int p1, int p2);

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
