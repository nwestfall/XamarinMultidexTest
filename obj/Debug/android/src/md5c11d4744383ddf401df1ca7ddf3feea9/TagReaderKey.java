package md5c11d4744383ddf401df1ca7ddf3feea9;


public class TagReaderKey
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.os.Parcelable
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_GetCreator:()Landroid/os/Parcelable$Creator;:__export__\n" +
			"n_describeContents:()I:GetDescribeContentsHandler:Android.OS.IParcelableInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_writeToParcel:(Landroid/os/Parcel;I)V:GetWriteToParcel_Landroid_os_Parcel_IHandler:Android.OS.IParcelableInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Tyler.Drive.RFID.TagReaderKey, Tyler.Drive.RFID, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", TagReaderKey.class, __md_methods);
	}


	public TagReaderKey () throws java.lang.Throwable
	{
		super ();
		if (getClass () == TagReaderKey.class)
			mono.android.TypeManager.Activate ("Tyler.Drive.RFID.TagReaderKey, Tyler.Drive.RFID, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public TagReaderKey (android.hardware.usb.UsbDevice p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == TagReaderKey.class)
			mono.android.TypeManager.Activate ("Tyler.Drive.RFID.TagReaderKey, Tyler.Drive.RFID, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Hardware.Usb.UsbDevice, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}

	public TagReaderKey (android.os.Parcel p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == TagReaderKey.class)
			mono.android.TypeManager.Activate ("Tyler.Drive.RFID.TagReaderKey, Tyler.Drive.RFID, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.OS.Parcel, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public static android.os.Parcelable.Creator CREATOR = GetCreator ();

	public static android.os.Parcelable.Creator GetCreator ()
	{
		return n_GetCreator ();
	}

	private static native android.os.Parcelable.Creator n_GetCreator ();


	public int describeContents ()
	{
		return n_describeContents ();
	}

	private native int n_describeContents ();


	public void writeToParcel (android.os.Parcel p0, int p1)
	{
		n_writeToParcel (p0, p1);
	}

	private native void n_writeToParcel (android.os.Parcel p0, int p1);

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
