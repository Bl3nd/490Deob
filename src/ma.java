import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

final class ma extends bh implements MouseWheelListener {
	
	private int m = 0;
	
	final void a(Component component, byte var2) {
		component.addMouseWheelListener(this);
		if (var2 != -55) {
			this.mouseWheelMoved(null);
		}
		
	}
	
	public final synchronized void mouseWheelMoved(MouseWheelEvent var1) {
		try {
			this.m += var1.getWheelRotation();
		} catch (RuntimeException var3) {
			throw var3;
		}
	}
	
	final void a(Component component, int var2) {
		try {
			component.removeMouseWheelListener(this);
			if (var2 != 15929) {
				this.e(123);
			}
			
		} catch (RuntimeException var4) {
			throw var4;
		}
	}
	
	final synchronized int e(int var1) {
		try {
			if (var1 < 102) {
				this.mouseWheelMoved((MouseWheelEvent) null);
			}
			
			int var2 = this.m;
			this.m = 0;
			return var2;
		} catch (RuntimeException var3) {
			throw var3;
		}
	}
}
