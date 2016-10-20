final class u extends sg {
	
	private pi s = new pi();
	private pi t = new pi();
	private int u = 0;
	private int v = -1;
	
	final synchronized void a(sg var1) {
		var1.c(128);
	}
	
	final synchronized void d(int var1) {
		do {
			if (this.v < 0) {
				this.e(var1);
				return;
			}
			
			if (this.u + var1 < this.v) {
				this.u += var1;
				this.e(var1);
				return;
			}
			
			int var2 = this.v - this.u;
			this.e(var2);
			var1 -= var2;
			this.u += var2;
			this.e();
			ha var3 = (ha) this.t.a((byte) -9);
			synchronized (var3) {
				int var6 = var3.a(this);
				if (var6 < 0) {
					var3.o = 0;
					this.a(var3);
				} else {
					var3.o = var6;
					this.a(var3.vd_n, var3);
				}
			}
		} while (var1 != 0);
		
	}
	
	final int b() {
		return 0;
	}
	
	private final void a(vd var1, ha var2) {
		while (var1 != this.t.m && ((ha) var1).o <= var2.o) {
			var1 = var1.vd_n;
		}
		
		this.t.a(false, var1, var2);
		this.v = ((ha) this.t.m.vd_n).o;
	}
	
	private final void e(int var1) {
		for (sg var2 = (sg) this.s.a((byte) -9); var2 != null; var2 = (sg) this.s.b((byte) -116)) {
			var2.d(var1);
		}
		
	}
	
	private final void e() {
		if (this.u > 0) {
			for (ha var1 = (ha) this.t.a((byte) -9); var1 != null; var1 = (ha) this.t.b((byte) 111)) {
				var1.o -= this.u;
			}
			
			this.v -= this.u;
			this.u = 0;
		}
		
	}
	
	final sg c() {
		return (sg) this.s.a((byte) -9);
	}
	
	final sg d() {
		return (sg) this.s.b((byte) -92);
	}
	
	private final void c(int[] var1, int var2, int var3) {
		for (sg var4 = (sg) this.s.a((byte) -9); var4 != null; var4 = (sg) this.s.b((byte) -50)) {
			var4.b(var1, var2, var3);
		}
		
	}
	
	final synchronized void a(int[] var1, int var2, int var3) {
		do {
			if (this.v < 0) {
				this.c(var1, var2, var3);
				return;
			}
			
			if (this.u + var3 < this.v) {
				this.u += var3;
				this.c(var1, var2, var3);
				return;
			}
			
			int var4 = this.v - this.u;
			this.c(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.u += var4;
			this.e();
			ha var5 = (ha) this.t.a((byte) -9);
			synchronized (var5) {
			}
			
			try {
				int var8 = var5.a(this);
				if (var8 < 0) {
					var5.o = 0;
					this.a(var5);
				} else {
					var5.o = var8;
					this.a(var5.vd_n, var5);
				}
			} catch (Throwable var10) {
				throw var10;
			}
		} while (var3 != 0);
		
	}
	
	private final void a(ha var1) {
		var1.c(128);
		var1.a();
		vd var2 = this.t.m.vd_n;
		if (var2 == this.t.m) {
			this.v = -1;
		} else {
			this.v = ((ha) var2).o;
		}
	}
	
	final synchronized void b(sg var1) {
		this.s.a(var1, true);
	}
}
