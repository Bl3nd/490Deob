import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;

final class mc extends kg implements ImageProducer, ImageObserver {
	
	static vc t = new vc(5);
	static ob u = rf.a(40, ")2");
	static int v;
	static int w;
	private ColorModel x;
	static int y;
	static int z;
	static int A;
	static int B;
	static int C;
	static int D;
	static int F;
	private ImageConsumer H;
	static int I;
	static int J;
	static int K;
	
	private final synchronized void a(int var1, byte var2, int var3, int var4, int var5) {
		try {
			++D;
			if (this.H != null) {
				this.H.setPixels(var4, var3, var1, var5, this.x, super.s, var3 * super.width + var4, super.width);
				if (var2 != 28) {
					this.requestTopDownLeftRightResend((ImageConsumer) null);
				}
				
				this.H.imageComplete(2);
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "mc.B(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
		}
	}
	
	final void a(int x, Graphics graphics, int y, int var4) {
		try {
			++K;
			this.b((byte) 97);
			graphics.drawImage(super.image, x, y, this);
		} catch (RuntimeException var6) {
			throw bc.a(var6, "mc.D(" + x + ',' + (graphics != null ? "{...}" : "null") + ',' + y + ',' + var4 + ')');
		}
	}
	
	public final void startProduction(ImageConsumer var1) {
		try {
			this.addConsumer(var1);
			++y;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "mc.startProduction(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	final void a(int var1, int var2, Component var3, int var4) {
		try {
			super.height = var1;
			++C;
			super.width = var4;
			super.s = new int[var4 * var1 - -1];
			this.x = new DirectColorModel(32, 16711680, '\uff00', 255);
			if (var2 == 20053) {
				super.image = var3.createImage(this);
				this.b((byte) 66);
				var3.prepareImage(super.image, this);
				this.b((byte) 47);
				var3.prepareImage(super.image, this);
				this.b((byte) 73);
				var3.prepareImage(super.image, this);
				this.a((int) -5);
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "mc.A(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ')');
		}
	}
	
	public final synchronized boolean isConsumer(ImageConsumer var1) {
		try {
			++B;
			return this.H == var1;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "mc.isConsumer(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	public final void requestTopDownLeftRightResend(ImageConsumer var1) {
		try {
			++I;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "mc.requestTopDownLeftRightResend(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	private synchronized void b(byte var1) {
		try {
			++w;
			if (this.H != null) {
				if (var1 < 9) {
					this.b((byte) -3);
				}
				
				this.H.setPixels(0, 0, super.width, super.height, this.x, super.s, 0, super.width);
				this.H.imageComplete(2);
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "mc.C(" + var1 + ')');
		}
	}
	
	final void a(int var1, int var2, int var3, Graphics var4, int var5, int var6) {
		try {
			int var7 = -34 % ((-40 - var1) / 37);
			this.a(var2, (byte) 28, var5, var3, var6);
			++v;
			Shape var8 = var4.getClip();
			var4.clipRect(var3, var5, var2, var6);
			var4.drawImage(super.image, 0, 0, this);
			var4.setClip(var8);
		} catch (RuntimeException var9) {
			throw bc.a(var9, "mc.E(" + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ',' + var5 + ',' + var6 + ')');
		}
	}
	
	public static void c(int var0) {
		try {
			u = null;
			t = null;
			if (var0 != 0) {
				t = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "mc.F(" + var0 + ')');
		}
	}
	
	public final boolean imageUpdate(Image var1, int var2, int var3, int var4, int var5, int var6) {
		try {
			++z;
			return true;
		} catch (RuntimeException var8) {
			throw bc.a(var8, "mc.imageUpdate(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
		}
	}
	
	public final synchronized void removeConsumer(ImageConsumer var1) {
		try {
			++J;
			if (var1 == this.H) {
				this.H = null;
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "mc.removeConsumer(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	public final synchronized void addConsumer(ImageConsumer var1) {
		try {
			++A;
			this.H = var1;
			var1.setDimensions(super.width, super.height);
			var1.setProperties((Hashtable) null);
			var1.setColorModel(this.x);
			var1.setHints(14);
		} catch (RuntimeException var3) {
			throw bc.a(var3, "mc.addConsumer(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
}
