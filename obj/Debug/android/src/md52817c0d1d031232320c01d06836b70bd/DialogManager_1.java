package md52817c0d1d031232320c01d06836b70bd;


public class DialogManager_1
	extends android.support.v4.app.DialogFragment
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_onActivityCreated:(Landroid/os/Bundle;)V:GetOnActivityCreated_Landroid_os_Bundle_Handler\n" +
			"n_onDestroyView:()V:GetOnDestroyViewHandler\n" +
			"n_onCreateView:(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;:GetOnCreateView_Landroid_view_LayoutInflater_Landroid_view_ViewGroup_Landroid_os_Bundle_Handler\n" +
			"n_onDismiss:(Landroid/content/DialogInterface;)V:GetOnDismiss_Landroid_content_DialogInterface_Handler\n" +
			"n_show:(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V:GetShow_Landroid_support_v4_app_FragmentManager_Ljava_lang_String_Handler\n" +
			"n_show:(Landroid/support/v4/app/FragmentTransaction;Ljava/lang/String;)I:GetShow_Landroid_support_v4_app_FragmentTransaction_Ljava_lang_String_Handler\n" +
			"";
		mono.android.Runtime.register ("Tyler.Drive.Components.DialogManager`1, Tyler.Drive.Components, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", DialogManager_1.class, __md_methods);
	}


	public DialogManager_1 () throws java.lang.Throwable
	{
		super ();
		if (getClass () == DialogManager_1.class)
			mono.android.TypeManager.Activate ("Tyler.Drive.Components.DialogManager`1, Tyler.Drive.Components, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public void onActivityCreated (android.os.Bundle p0)
	{
		n_onActivityCreated (p0);
	}

	private native void n_onActivityCreated (android.os.Bundle p0);


	public void onDestroyView ()
	{
		n_onDestroyView ();
	}

	private native void n_onDestroyView ();


	public android.view.View onCreateView (android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2)
	{
		return n_onCreateView (p0, p1, p2);
	}

	private native android.view.View n_onCreateView (android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2);


	public void onDismiss (android.content.DialogInterface p0)
	{
		n_onDismiss (p0);
	}

	private native void n_onDismiss (android.content.DialogInterface p0);


	public void show (android.support.v4.app.FragmentManager p0, java.lang.String p1)
	{
		n_show (p0, p1);
	}

	private native void n_show (android.support.v4.app.FragmentManager p0, java.lang.String p1);


	public int show (android.support.v4.app.FragmentTransaction p0, java.lang.String p1)
	{
		return n_show (p0, p1);
	}

	private native int n_show (android.support.v4.app.FragmentTransaction p0, java.lang.String p1);

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
