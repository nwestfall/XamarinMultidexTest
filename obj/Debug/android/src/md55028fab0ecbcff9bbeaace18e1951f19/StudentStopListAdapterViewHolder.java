package md55028fab0ecbcff9bbeaace18e1951f19;


public class StudentStopListAdapterViewHolder
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
		mono.android.Runtime.register ("Tyler.Drive.Ridership.Adapters.StudentStopListAdapterViewHolder, Tyler.Drive.Ridership, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", StudentStopListAdapterViewHolder.class, __md_methods);
	}


	public StudentStopListAdapterViewHolder (android.view.View p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == StudentStopListAdapterViewHolder.class)
			mono.android.TypeManager.Activate ("Tyler.Drive.Ridership.Adapters.StudentStopListAdapterViewHolder, Tyler.Drive.Ridership, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Views.View, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
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
