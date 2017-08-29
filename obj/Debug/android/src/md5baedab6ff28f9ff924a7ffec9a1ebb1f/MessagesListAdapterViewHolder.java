package md5baedab6ff28f9ff924a7ffec9a1ebb1f;


public class MessagesListAdapterViewHolder
	extends android.support.v7.widget.RecyclerView.ViewHolder
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClick:(Landroid/view/View;)V:GetOnClick_Landroid_view_View_Handler:Android.Views.View/IOnClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Tyler.Drive.Components.Adapters.MessagesListAdapterViewHolder, Tyler.Drive.Components, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MessagesListAdapterViewHolder.class, __md_methods);
	}


	public MessagesListAdapterViewHolder (android.view.View p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == MessagesListAdapterViewHolder.class)
			mono.android.TypeManager.Activate ("Tyler.Drive.Components.Adapters.MessagesListAdapterViewHolder, Tyler.Drive.Components, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Views.View, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public void onClick (android.view.View p0)
	{
		n_onClick (p0);
	}

	private native void n_onClick (android.view.View p0);

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
