package md5649c99a04d16b49e483268767d822a8b;


public class AppCompatDialogService_OnDismissListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.content.DialogInterface.OnDismissListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDismiss:(Landroid/content/DialogInterface;)V:GetOnDismiss_Landroid_content_DialogInterface_Handler:Android.Content.IDialogInterfaceOnDismissListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("JimBobBennett.MvvmLight.AppCompat.AppCompatDialogService+OnDismissListener, JimBobBennett.MvvmLight.AppCompat, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", AppCompatDialogService_OnDismissListener.class, __md_methods);
	}


	public AppCompatDialogService_OnDismissListener () throws java.lang.Throwable
	{
		super ();
		if (getClass () == AppCompatDialogService_OnDismissListener.class)
			mono.android.TypeManager.Activate ("JimBobBennett.MvvmLight.AppCompat.AppCompatDialogService+OnDismissListener, JimBobBennett.MvvmLight.AppCompat, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onDismiss (android.content.DialogInterface p0)
	{
		n_onDismiss (p0);
	}

	private native void n_onDismiss (android.content.DialogInterface p0);

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
