final class nf extends af {
	
	static int R;
	static int S = 0;
	static boolean T = false;
	static int U;
	static ob W = rf.a(40, "Die Adresse dieses Computers wurde gesperrt)1");
	static int X;
	static int[] Y;
	static int Z;
	private int ab;
	static int bb;
	static int cb;
	static int db;
	static vc eb = new vc(64);
	static int fb;
	static int gb;
	private static ob loadedWordpack = rf.a(40, "Loaded wordpack");
	static pi ib;
	static ob[] jb;
	static ob loadedWordpack2;
	private static ob lb;
	static ob mb;
	static ob nb;
	static ob ob;
	static ob tradeRequest;
	
	static Object a(boolean var0, boolean var1, byte[] var2) {
		try {
			++R;
			if (var2 == null) {
				return null;
			} else {
				if (var2.length > 136 && !id.p) {
					try {
						ee var3 = (ee) Class.forName("lc").newInstance();
						var3.a(var2, 0);
						return var3;
					} catch (Throwable var4) {
						id.p = true;
					}
				}
				
				return !var0 ? null : (!var1 ? var2 : bh.a((byte[]) var2, (int) 16086));
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "nf.A(" + var0 + ',' + var1 + ',' + "{...}" + ')');
		}
	}
	
	static boolean a(ra var0, int var1) {
		int var5 = client.anInt_wb;
		
		try {
			++U;
			if (var0.hc == null) {
				return false;
			} else {
				int var2 = var1;
				if (var5 == 0 && ~var0.hc.length >= ~var1) {
					return true;
				} else {
					do {
						int var3 = jd.a(var2, var0, var1 + -31519);
						int var4 = var0.Lc[var2];
						if (~var0.hc[var2] == -3) {
							if (~var3 <= ~var4) {
								return false;
							}
						} else if (~var0.hc[var2] == -4) {
							if (~var4 <= ~var3) {
								return false;
							}
						} else if (var0.hc[var2] != 4) {
							if (var3 != var4) {
								return false;
							}
						} else if (var4 == var3) {
							return false;
						}
						
						++var2;
					} while (~var0.hc.length < ~var2);
					
					return true;
				}
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "nf.D(" + "{...}" + ',' + var1 + ')');
		}
	}
	
	static void d(int unused, int unused2, int id) {
		try {
			++fb;
			if (bc.mb != 0 && id != -1) {
				ac.a(false, id, true, qe.cacheFile_11, 0, bc.mb);
				li.aBoolean_q = true;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "nf.C(" + unused + ',' + unused2 + ',' + id + ')');
		}
	}
	
	private nf(int var1) {
		super(0, true);
		this.ab = 4096;
		
		try {
			this.ab = var1;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "nf.<init>(" + var1 + ')');
		}
	}
	
	public static void i(int var0) {
		try {
			mb = null;
			eb = null;
			ib = null;
			nb = null;
			W = null;
			lb = null;
			jb = null;
			loadedWordpack = null;
			ob = null;
			Y = null;
			loadedWordpack2 = null;
			if (var0 == -3) {
				tradeRequest = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "nf.E(" + var0 + ')');
		}
	}
	
	final int[] a(byte var1, int var2) {
		try {
			if (var1 <= 13) {
				a((ra) null, 112);
			}
			
			int[] var3 = super.nd_v.a(var2, 12);
			++cb;
			if (super.nd_v.n) {
				p.a(var3, 0, lh.eb, this.ab);
			}
			
			return var3;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "nf.F(" + var1 + ',' + var2 + ')');
		}
	}
	
	final void a(int var1, int var2, og var3) {
		try {
			if (var1 == 0) {
				this.ab = (var3.readUnsignedByte(255) << 12) / 255;
			}
			
			++bb;
		} catch (RuntimeException var6) {
			throw bc.a(var6, "nf.B(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	public nf() {
		this(4096);
	}
	
	static {
		loadedWordpack2 = loadedWordpack;
		jb = new ob[1000];
		ib = new pi();
		lb = rf.a(40, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");
		ob = rf.a(40, "null");
		nb = lb;
		mb = rf.a(40, " weitere Optionen");
		tradeRequest = rf.a(40, ":tradereq:");
	}
}
