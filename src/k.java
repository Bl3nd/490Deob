import java.awt.Component;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class k extends kg {
	
	private Component component;
	
	final void a(int x, Graphics graphics, int y, int var4) {
		graphics.drawImage(this.image, x, y, this.component);
	}
	
	final void a(int var1, int var2, Component var3, int var4) {
		this.s = new int[var1 * var4 - -1];
		this.height = var1;
		if (var2 == 20053) {
			this.width = var4;
			DataBufferInt dataBufferInt = new DataBufferInt(this.s, this.s.length);
			DirectColorModel directColorModel = new DirectColorModel(32, 16711680, '\uff00', 255);
			WritableRaster writableRaster = Raster.createWritableRaster(
					directColorModel.createCompatibleSampleModel(this.width, this.height), dataBufferInt, null);
			this.image = new BufferedImage(directColorModel, writableRaster, false, new Hashtable());
			this.component = var3;
			this.a(-5);
		}
	}
	
	final void a(int var1, int var2, int var3, Graphics var4, int var5, int var6) {
		try {
			Shape var7 = var4.getClip();
			var4.clipRect(var3, var5, var2, var6);
			var4.drawImage(this.image, 0, 0, this.component);
			int var8 = 127 / ((-40 - var1) / 37);
			var4.setClip(var7);
		} catch (RuntimeException var9) {
			throw var9;
		}
	}
}
