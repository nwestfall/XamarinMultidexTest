package md5db3c4a846984cf20afe52088f10e43b8;


public class AcsReader
	extends com.acs.smartcard.Reader
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Tyler.Drive.RFID.Acs.AcsReader, Tyler.Drive.RFID, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", AcsReader.class, __md_methods);
	}


	public AcsReader (android.hardware.usb.UsbManager p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == AcsReader.class)
			mono.android.TypeManager.Activate ("Tyler.Drive.RFID.Acs.AcsReader, Tyler.Drive.RFID, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Hardware.Usb.UsbManager, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
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
