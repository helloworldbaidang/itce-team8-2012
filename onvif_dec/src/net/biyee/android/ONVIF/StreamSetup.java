package net.biyee.android.ONVIF;

import org.simpleframework.xml.Default;
import org.simpleframework.xml.DefaultType;
import org.simpleframework.xml.Root;

@Default(DefaultType.FIELD)
@Root(strict=false)
public class StreamSetup
{
  public StreamType Stream;
  public Transport Transport;
}

/* Location:           D:\setup\Android\Tools\classes_dex2jar.jar
 * Qualified Name:     net.biyee.android.ONVIF.StreamSetup
 * JD-Core Version:    0.6.0
 */