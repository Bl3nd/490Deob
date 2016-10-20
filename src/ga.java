final class ga extends hg {
	
	static int i;
	static int j = 0;
	private int k;
	static ob l;
	static ob m = rf.a(40, "<img=1>");
	private int n;
	private int o;
	private int p;
	private long q;
	private static ob r = rf.a(40, "Please enter your password)3");
	static int s;
	static int t;
	static ob u = rf.a(40, "Ung-Ultige Verbindung mit einem Anmelde)2Server)3");
	private long[] v;
	static pe cacheFile22;
	
	final int a(int var1, int var2, int var3) {
		int var7 = client.anInt_wb;
		
		try {
			int var4 = this.n;
			this.n = 300;
			if (var1 >= -93) {
				return -90;
			} else {
				label67:
				{
					++i;
					int var5 = this.k;
					this.k = 1;
					this.q = a.a((byte) -94);
					if (this.v[this.p] == 0L) {
						this.n = var4;
						this.k = var5;
						if (var7 == 0) {
							break label67;
						}
					}
					
					if (~this.q < ~this.v[this.p]) {
						this.n = (int) ((long) (var3 * 2560) / (this.q + -this.v[this.p]));
					}
				}
				
				if (~this.n > -26) {
					this.n = 25;
				}
				
				if (this.n > 256) {
					this.n = 256;
					this.k = (int) (-((-this.v[this.p] + this.q) / 10L) + (long) var3);
				}
				
				if (var3 < this.k) {
					this.k = var3;
				}
				
				this.v[this.p] = this.q;
				this.p = (1 + this.p) % 10;
				int var6;
				if (~this.k < -2) {
					var6 = 0;
					if (var7 != 0 || var6 < 10) {
						do {
							if (this.v[var6] != 0L) {
								this.v[var6] -= -((long) this.k);
							}
							
							++var6;
						} while (var6 < 10);
					}
				}
				
				if (this.k < var2) {
					this.k = var2;
				}
				
				var6 = 0;
				jd.a((long) this.k, (byte) -8);
				if (var7 != 0) {
					++var6;
					this.o += this.n;
				}
				
				while (this.o < 256) {
					++var6;
					this.o += this.n;
				}
				
				this.o &= 255;
				return var6;
			}
		} catch (RuntimeException var8) {
			throw bc.a(var8, "ga.E(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	public static void a(int var0) {
		try {
			l = null;
			m = null;
			u = null;
			r = null;
			cacheFile22 = null;
			if (var0 <= 98) {
				r = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ga.F(" + var0 + ')');
		}
	}
	
	final void a(byte var1) {
		int var3 = client.anInt_wb;
		
		try {
			int var2 = 0;
			if (var3 != 0) {
				this.v[var2] = 0L;
				++var2;
			}
			
			while (~var2 > -11) {
				this.v[var2] = 0L;
				++var2;
			}
			
			if (var1 != 112) {
				this.a((byte) -111);
			}
			
			++t;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "ga.D(" + var1 + ')');
		}
	}
	
	static void b(int var0) {
		try {
			jf.T.b((int) 9946);
			++s;
			if (var0 != 255) {
				a((int) -76);
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ga.G(" + var0 + ')');
		}
	}
	
	ga() {
		super();
		int var2 = client.anInt_wb;
		this.v = new long[10];
		
		try {
			this.k = 1;
			this.n = 256;
			this.o = 0;
			this.q = a.a((byte) -48);
			int var1 = 0;
			if (var2 != 0 || ~var1 > -11) {
				do {
					this.v[var1] = this.q;
					++var1;
				} while (~var1 > -11);
				
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ga.<init>(" + ')');
		}
	}
	
	static {
		l = r;
	}
}
