package md54f86245255f3992896aa4d0617b44191;


public class StudentRidership
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Tyler.Drive.Ridership.StudentRidership, Tyler.Drive.Ridership, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", StudentRidership.class, __md_methods);
	}


	public StudentRidership () throws java.lang.Throwable
	{
		super ();
		if (getClass () == StudentRidership.class)
			mono.android.TypeManager.Activate ("Tyler.Drive.Ridership.StudentRidership, Tyler.Drive.Ridership, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

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
