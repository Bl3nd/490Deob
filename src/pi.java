final class pi {
	
	private static ob a = rf.a(40, " from your ignore list first)3");
	static int b;
	static pe cacheFile4;
	static ob d;
	static int e;
	static int f;
	static int g;
	static ah[] h = new ah[100];
	static int i;
	static int j;
	static int k;
	static int l;
	vd m = new vd();
	static int n;
	static ca cacheFile_14;
	static int p;
	static int q;
	static int r;
	static int s = 0;
	private vd t;
	
	final vd a(int var1) {
		try {
			++n;
			vd var2 = this.m.vd_n;
			if (var1 != -12462) {
				this.a(false, (vd) null, (vd) null);
			}
			
			if (this.m == var2) {
				return null;
			} else {
				var2.c(128);
				return var2;
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "pi.A(" + var1 + ')');
		}
	}
	
	final void a(int var1, vd var2) {
		try {
			++e;
			if (var2.vd_l != null) {
				var2.c(128);
			}
			
			var2.vd_n = this.m;
			var2.vd_l = this.m.vd_l;
			var2.vd_l.vd_n = var2;
			if (var1 != 0) {
				this.a(true, (vd) null, (vd) null);
			}
			
			var2.vd_n.vd_l = var2;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "pi.G(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}
	
	public static void b(int var0) {
		try {
			if (var0 == 100) {
				d = null;
				h = null;
				cacheFile_14 = null;
				cacheFile4 = null;
				a = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "pi.F(" + var0 + ')');
		}
	}
	
	final void a(vd var1, boolean var2) {
		try {
			++i;
			if (var1.vd_l != null) {
				var1.c(128);
			}
			
			var1.vd_n = this.m.vd_n;
			var1.vd_l = this.m;
			if (!var2) {
				this.a((vd) null, false);
			}
			
			var1.vd_l.vd_n = var1;
			var1.vd_n.vd_l = var1;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "pi.D(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}
	
	final void a(boolean var1, vd var2, vd var3) {
		try {
			if (var3.vd_l != null) {
				var3.c(128);
			}
			
			var3.vd_l = var2.vd_l;
			if (!var1) {
				++f;
				var3.vd_n = var2;
				var3.vd_l.vd_n = var3;
				var3.vd_n.vd_l = var3;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "pi.I(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	final void c(int unused) {
		try {
			++q;
			
			while (true) {
				vd vd = this.m.vd_n;
				if (vd == this.m) {
					return;
				}
				
				vd.c(128);
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "pi.C(" + unused + ')');
		}
	}
	
	final vd a(byte unused) {
		try {
			++b;
			vd var2 = this.m.vd_n;
			if (var2 == this.m) {
				this.t = null;
				return null;
			} else {
				this.t = var2.vd_n;
				return var2;
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "pi.J(" + unused + ')');
		}
	}
	
	final vd d(int var1) {
		try {
			vd var2 = this.m.vd_l;
			int var3 = -39 / ((-18 - var1) / 41);
			++l;
			if (var2 == this.m) {
				this.t = null;
				return null;
			} else {
				this.t = var2.vd_l;
				return var2;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "pi.H(" + var1 + ')');
		}
	}
	
	final vd e(int var1) {
		try {
			++g;
			vd var2 = this.t;
			if (this.m == var2) {
				this.t = null;
				return null;
			} else if (var1 != -21824) {
				return null;
			} else {
				this.t = var2.vd_l;
				return var2;
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "pi.B(" + var1 + ')');
		}
	}
	
	final vd b(byte unused) {
		try {
			++j;
			vd var2 = this.t;
			if (this.m == var2) {
				this.t = null;
				return null;
			} else {
				this.t = var2.vd_n;
				return var2;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "pi.E(" + unused + ')');
		}
	}
	
	public pi() {
		try {
			this.m.vd_l = this.m;
			this.m.vd_n = this.m;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "pi.<init>(" + ')');
		}
	}
	
	static {
		d = a;
	}
}
