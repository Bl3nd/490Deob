import java.io.DataInputStream;
import java.net.URL;

final class ra {
	
	boolean a;
	Object[] b;
	int c = -1;
	int[] d;
	int anInt_e = 0;
	ob f;
	static int g;
	boolean h;
	int i = -1;
	Object[] j;
	int k = 0;
	int[] l;
	int[] m;
	static int n;
	ra o;
	static int p;
	int q;
	boolean aBoolean_r;
	Object[] s;
	int anInt_t;
	static ob u = rf.a(40, "oberen Rand der Webseite ausw-=hlen)3");
	int v = 0;
	int w = 0;
	int x = -1;
	Object[] y;
	static ob scapeMain = rf.a(40, "scape main");
	Object[] A;
	int B;
	int C;
	Object[] D;
	boolean E;
	Object[] F;
	Object[] G;
	boolean H = false;
	static int I = 0;
	int J;
	int K = 0;
	int L;
	int[][] M;
	int N = 0;
	static int O;
	boolean P;
	int[] Q;
	boolean R;
	int S = 0;
	ob T;
	Object[] U;
	boolean V;
	Object[] W;
	Object[] X;
	int Y;
	static int Z;
	int ab = 0;
	int bb = 1;
	int anInt_cb;
	Object[] db;
	boolean eb;
	int[] fb;
	int gb;
	int hb;
	Object[] objects_ib;
	int jb;
	int kb;
	ob ob_lb;
	int[] mb;
	int nb;
	private int ob;
	Object[] pb;
	int[] qb;
	static int rb;
	static int anInt_sb;
	int tb;
	Object[] ub;
	Object[] vb;
	int wb;
	ra[] xb;
	int yb;
	int zb;
	int Ab;
	ob Bb;
	static int Cb;
	Object[] Db;
	static volatile int Eb = 0;
	int Fb;
	int Gb;
	int[] Hb;
	static int Ib;
	Object[] Jb;
	int Kb;
	int Lb;
	ob Mb;
	int Nb;
	int Ob;
	static int Pb;
	int Qb;
	int Rb;
	static int Sb;
	int Tb;
	Object[] Ub;
	boolean Vb;
	int[] Wb;
	int Xb;
	static int Yb;
	Object[] Zb;
	int ac;
	int anInt_bc;
	Object[] objects_cc;
	Object[] dc;
	static ob ec = rf.a(40, "Anmelde)2Zeitlimit -Uberschritten)3");
	static int fc;
	int gc;
	int[] hc;
	int ic;
	ob[] jc;
	Object[] kc;
	int lc;
	static int mc = 0;
	int nc;
	static int oc;
	int pc;
	boolean aBoolean_qc;
	int rc;
	ob sc;
	int[] ints_tc;
	int uc;
	int vc;
	int anInt_wc;
	Object[] xc;
	int yc;
	private int zc;
	int Ac;
	boolean Bc;
	static int Cc;
	static int Dc;
	int Ec;
	int Fc;
	Object[] Gc;
	Object[] Hc;
	int Ic;
	int Jc;
	int Kc;
	int[] Lc;
	ob[] Mc;
	int Nc;
	int Oc;
	
	final i a(int var1, fa[] var2) {
		try {
			sa.b = false;
			if (var1 != 1) {
				this.a(false, (byte) -57);
			}
			
			++Dc;
			if (~this.yc == 0) {
				return null;
			} else {
				i var3 = (i) mi.W.a((long) this.yc, (byte) 109);
				if (var3 != null) {
					return var3;
				} else {
					var3 = wc.a(sf.cacheFile8, ug.cacheFile13, this.yc, -98, 0);
					if (var3 == null) {
						sa.b = true;
						if (client.anInt_wb == 0) {
							return var3;
						}
					}
					
					var3.a(var2, null);
					mi.W.a(var3, (byte) -90, (long) this.yc);
					return var3;
				}
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "ra.K(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}
	
	final fe a(boolean var1, boolean var2, int var3, ce var4, hc var5) {
		try {
			int var6;
			int var7;
			label92:
			{
				++p;
				sa.b = false;
				if (!var1) {
					var7 = this.nb;
					var6 = this.bb;
					if (client.anInt_wb == 0) {
						break label92;
					}
				}
				
				var6 = this.ob;
				var7 = this.zc;
			}
			
			if (var6 == 0) {
				return null;
			} else if (var6 == 1 && ~var7 == 0) {
				return null;
			} else {
				if (!var2) {
					this.B = 67;
				}
				
				fe var8;
				if (var6 == 1) {
					var8 = (fe) rd.N.a((long) (var7 + (var6 << 16)), (byte) -119);
					if (var8 == null) {
						cb var12 = cb.a(qc.cacheFile7, var7, 0);
						if (var12 == null) {
							sa.b = true;
							return null;
						}
						
						var8 = var12.b(64, 768, -50, -10, -50);
						rd.N.a(var8, (byte) -53, (long) (var7 + (var6 << 16)));
					}
					
					if (var4 != null) {
						var8 = var4.a(var8, var3, true);
					}
					
					return var8;
				} else if (~var6 == -3) {
					var8 = ei.b(var7, 0).a(112, var3, var4);
					if (var8 == null) {
						sa.b = true;
						return null;
					} else {
						return var8;
					}
				} else if (var6 == 3) {
					if (var5 == null) {
						return null;
					} else {
						var8 = var5.a(var3, var2, var4);
						if (var8 == null) {
							sa.b = true;
							return null;
						} else {
							return var8;
						}
					}
				} else if (var6 == 4) {
					ei var11 = jg.a((byte) -61, var7);
					fe var9 = var11.a(-84, var4, 10, var3);
					if (var9 == null) {
						sa.b = true;
						return null;
					} else {
						return var9;
					}
				} else if (var6 == 6) {
					var8 = ei.b(var7, 0).a(true, 0, var4, null, var3);
					if (var8 == null) {
						sa.b = true;
						return null;
					} else {
						return var8;
					}
				} else {
					return null;
				}
			}
		} catch (RuntimeException var10) {
			throw bc.a(var10, "ra.E(" + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ',' + (var5 != null ? "{...}" : "null") + ')');
		}
	}
	
	static void a(String var0, Throwable var1, byte var2) {
		int var7 = client.anInt_wb;
		
		++g;
		int var3 = -11 % ((1 - var2) / 48);
		
		try {
			String var4 = "";
			if (var1 != null) {
				var4 = cc.a((byte) 99, var1);
			}
			
			if (var0 != null) {
				if (var1 != null) {
					var4 = var4 + " | ";
				}
				
				var4 = var4 + var0;
			}
			
			System.out.println("Error: " + var4);
			var4 = var4.replace(':', '.');
			var4 = var4.replace('@', '_');
			var4 = var4.replace('&', '_');
			var4 = var4.replace('#', '_');
			if (lf.v.m != null) {
				fd var5 = lf.v.a(-18, new URL(lf.v.m.getCodeBase(), "clienterror.ws?c=" + ib.i + "&u=" + r.X + "&v1=" + t.javaVendor + "&v2=" + t.javaVersion + "&e=" + var4));
				if (var7 != 0) {
					jd.a(1L, (byte) -8);
				}
				
				while (~var5.d == -1) {
					jd.a(1L, (byte) -8);
				}
				
				if (var5.d == 1) {
					DataInputStream var6 = (DataInputStream) var5.e;
					var6.read();
					var6.close();
				}
			}
		} catch (Exception var8) {
			var8.printStackTrace();
		}
	}
	
	private Object[] a(int var1, og var2) {
		try {
			++n;
			int var3 = var2.readUnsignedByte(255);
			if (~var3 == var1) {
				return null;
			} else {
				Object[] objects = new Object[var3];
				int index = 0;
				if (~index <= ~var3) {
					this.Vb = true;
					return objects;
				} else {
					do {
						int var6 = var2.readUnsignedByte(255);
						if (~var6 != -1) {
							if (var6 == 1) {
								objects[index] = var2.t(-19405);
								++index;
							} else {
								++index;
							}
						} else {
							objects[index] = var2.readInt(1029109968);
							++index;
						}
					} while (~index > ~var3);
					
					this.Vb = true;
					return objects;
				}
			}
		} catch (RuntimeException var8) {
			throw bc.a(var8, "ra.B(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}
	
	final void a(int var1, int var2, int var3) {
		try {
			++Sb;
			int var4 = this.ints_tc[var2];
			this.ints_tc[var2] = this.ints_tc[var3];
			this.ints_tc[var3] = var4;
			var4 = this.fb[var2];
			if (var1 != Integer.MIN_VALUE) {
				this.Kb = 74;
			}
			
			this.fb[var2] = this.fb[var3];
			this.fb[var3] = var4;
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ra.N(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	final void a(og var1, int var2) {
		int var12 = client.anInt_wb;
		
		try {
			++O;
			this.R = false;
			this.Ac = var1.readUnsignedByte(255);
			this.uc = var1.readUnsignedByte(255);
			this.ab = var1.readShort(127);
			this.anInt_bc = this.Nb = var1.readSignedShort((byte) -67);
			this.Jc = this.gc = var1.readSignedShort((byte) -67);
			if (var2 < -6) {
				label306:
				{
					this.L = var1.readShort(83);
					this.w = var1.readShort(63);
					this.kb = var1.readUnsignedByte(255);
					this.Ic = var1.readShort(124);
					if (~this.Ic != -65536) {
						this.Ic += this.Ec & -65536;
						if (var12 == 0) {
							break label306;
						}
					}
					
					this.Ic = -1;
				}
				
				this.tb = var1.readShort(42);
				if (~this.tb == -65536) {
					this.tb = -1;
				}
				
				int var3 = var1.readUnsignedByte(255);
				int var4;
				if (~var3 < -1) {
					this.hc = new int[var3];
					this.Lc = new int[var3];
					var4 = 0;
					if (var12 != 0 || ~var3 < ~var4) {
						do {
							this.hc[var4] = var1.readUnsignedByte(255);
							this.Lc[var4] = var1.readShort(123);
							++var4;
						} while (~var3 < ~var4);
					}
				}
				
				var4 = var1.readUnsignedByte(255);
				int var5;
				int var6;
				int var7;
				if (~var4 < -1) {
					this.M = new int[var4][];
					var5 = 0;
					if (var12 != 0 || ~var4 < ~var5) {
						do {
							var6 = var1.readShort(75);
							this.M[var5] = new int[var6];
							var7 = 0;
							if (var12 != 0 || var7 < var6) {
								do {
									this.M[var5][var7] = var1.readShort(112);
									if (this.M[var5][var7] == '\uffff') {
										this.M[var5][var7] = -1;
									}
									
									++var7;
								} while (var7 < var6);
							}
							
							++var5;
						} while (~var4 < ~var5);
					}
				}
				
				if (this.Ac == 0) {
					this.anInt_cb = var1.readShort(30);
					this.E = var1.readUnsignedByte(255) == 1;
				}
				
				if (this.Ac == 1) {
					var1.readShort(65);
					var1.readUnsignedByte(255);
				}
				
				if (this.Ac == 2) {
					this.fb = new int[this.L * this.w];
					this.ints_tc = new int[this.L * this.w];
					var5 = var1.readUnsignedByte(255);
					if (~var5 == -2) {
						this.v |= 268435456;
					}
					
					var6 = var1.readUnsignedByte(255);
					if (var6 == 1) {
						this.v |= 1073741824;
					}
					
					var7 = var1.readUnsignedByte(255);
					if (var7 == 1) {
						this.v |= Integer.MIN_VALUE;
					}
					
					int var8 = var1.readUnsignedByte(255);
					if (var8 == 1) {
						this.v |= 536870912;
					}
					
					this.Ab = var1.readUnsignedByte(255);
					this.hb = var1.readUnsignedByte(255);
					this.d = new int[20];
					this.qb = new int[20];
					this.m = new int[20];
					int var9 = 0;
					int var10;
					if (var12 != 0 || var9 < 20) {
						do {
							var10 = var1.readUnsignedByte(255);
							if (~var10 != -2) {
								this.qb[var9] = -1;
								if (var12 == 0) {
									++var9;
									continue;
								}
							}
							
							this.m[var9] = var1.readSignedShort((byte) -67);
							this.d[var9] = var1.readSignedShort((byte) -67);
							this.qb[var9] = var1.readInt(1029109968);
							++var9;
						} while (var9 < 20);
					}
					
					this.jc = new ob[5];
					var10 = 0;
					if (var12 != 0 || ~var10 > -6) {
						do {
							ob var11 = var1.t(-19405);
							if (~var11.a(false) < -1) {
								this.jc[var10] = var11;
								this.v |= 1 << 23 - -var10;
							}
							
							++var10;
						} while (~var10 > -6);
					}
				}
				
				if (~this.Ac == -4) {
					this.eb = var1.readUnsignedByte(255) == 1;
				}
				
				if (~this.Ac == -5 || ~this.Ac == -2) {
					this.J = var1.readUnsignedByte(255);
					this.yb = var1.readUnsignedByte(255);
					this.anInt_e = var1.readUnsignedByte(255);
					this.yc = var1.readShort(57);
					if (~this.yc == -65536) {
						this.yc = -1;
					}
					
					this.a = ~var1.readUnsignedByte(255) == -2;
				}
				
				if (this.Ac == 4) {
					this.ob_lb = var1.t(-19405);
					this.T = var1.t(-19405);
				}
				
				if (~this.Ac == -2 || this.Ac == 3 || this.Ac == 4) {
					this.N = var1.readInt(1029109968);
				}
				
				if (this.Ac == 3 || ~this.Ac == -5) {
					this.anInt_t = var1.readInt(1029109968);
					this.Kb = var1.readInt(1029109968);
					this.K = var1.readInt(1029109968);
				}
				
				if (this.Ac == 5) {
					this.c = var1.readInt(1029109968);
					this.i = var1.readInt(1029109968);
				}
				
				if (~this.Ac == -7) {
					this.bb = 1;
					this.nb = var1.readShort(43);
					if (this.nb == '\uffff') {
						this.nb = -1;
					}
					
					this.ob = 1;
					this.zc = var1.readShort(44);
					if (this.zc == '\uffff') {
						this.zc = -1;
					}
					
					this.nc = var1.readShort(120);
					if (~this.nc == -65536) {
						this.nc = -1;
					}
					
					this.anInt_wc = var1.readShort(123);
					if (~this.anInt_wc == -65536) {
						this.anInt_wc = -1;
					}
					
					this.C = var1.readShort(124);
					this.k = var1.readShort(43);
					this.S = var1.readShort(34);
				}
				
				if (this.Ac == 7) {
					this.ints_tc = new int[this.w * this.L];
					this.fb = new int[this.w * this.L];
					this.J = var1.readUnsignedByte(255);
					this.yc = var1.readShort(91);
					if (this.yc == '\uffff') {
						this.yc = -1;
					}
					
					this.a = ~var1.readUnsignedByte(255) == -2;
					this.N = var1.readInt(1029109968);
					this.Ab = var1.readSignedShort((byte) -67);
					this.hb = var1.readSignedShort((byte) -67);
					var5 = var1.readUnsignedByte(255);
					this.jc = new ob[5];
					if (var5 == 1) {
						this.v |= 1073741824;
					}
					
					var6 = 0;
					if (var12 != 0 || var6 < 5) {
						do {
							ob var14 = var1.t(-19405);
							if (~var14.a(false) < -1) {
								this.jc[var6] = var14;
								this.v |= 1 << var6 + 23;
							}
							
							++var6;
						} while (var6 < 5);
					}
				}
				
				if (this.Ac == 8) {
					this.ob_lb = var1.t(-19405);
				}
				
				if (~this.uc == -3 || ~this.Ac == -3) {
					this.f = var1.t(-19405);
					this.Bb = var1.t(-19405);
					var5 = 63 & var1.readShort(115);
					this.v |= var5 << 11;
				}
				
				if (~this.uc == -2 || this.uc == 4 || ~this.uc == -6 || this.uc == 6) {
					this.sc = var1.t(-19405);
					if (this.sc.a(false) == 0) {
						if (~this.uc == -2) {
							this.sc = rd.L;
						}
						
						if (~this.uc == -5) {
							this.sc = e.i;
						}
						
						if (~this.uc == -6) {
							this.sc = e.i;
						}
						
						if (~this.uc == -7) {
							this.sc = kd.gb;
						}
					}
				}
				
				if (~this.uc == -2 || ~this.uc == -5 || this.uc == 5) {
					this.v |= 4194304;
				}
				
				if (this.uc == 6) {
					this.v |= 1;
				}
			}
		} catch (RuntimeException var13) {
			throw bc.a(var13, "ra.L(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}
	
	final void a(boolean var1, og var2) {
		try {
			this.R = true;
			++Yb;
			++var2.pointer;
			this.Ac = var2.readUnsignedByte(255);
			this.ab = var2.readShort(81);
			this.anInt_bc = this.Nb = var2.readSignedShort((byte) -67);
			this.Jc = this.gc = var2.readSignedShort((byte) -67);
			this.L = var2.readShort(51);
			if (this.Ac == 9) {
				this.w = var2.readSignedShort((byte) -67);
			} else {
				this.w = var2.readShort(90);
			}
			
			this.Ic = var2.readShort(127);
			if (this.Ic == 65535) {
				this.Ic = -1;
			} else {
				this.Ic += -65536 & this.Ec;
			}
			
			this.E = var2.readUnsignedByte(255) == 1;
			if (this.Ac == 0) {
				this.lc = var2.readShort(50);
				this.anInt_cb = var2.readShort(49);
			} else if (this.Ac == 5) {
				this.c = var2.readInt(1029109968);
				this.Y = var2.readShort(120);
				this.aBoolean_r = var2.readUnsignedByte(255) == 1;
				this.kb = var2.readUnsignedByte(255);
				this.ac = var2.readUnsignedByte(255);
				this.q = var2.readInt(1029109968);
				this.P = var2.readUnsignedByte(255) == 1;
				this.Bc = var2.readUnsignedByte(255) == 1;
			} else if (this.Ac == 6) {
				this.bb = 1;
				this.nb = var2.readShort(121);
				if (this.nb == '\uffff') {
					this.nb = -1;
				}
				
				this.Xb = var2.readSignedShort((byte) -67);
				this.Ob = var2.readSignedShort((byte) -67);
				this.k = var2.readShort(63);
				this.S = var2.readShort(61);
				this.pc = var2.readShort(76);
				this.C = var2.readShort(32);
				this.nc = var2.readShort(63);
				if (~this.nc == -65536) {
					this.nc = -1;
				}
				
				this.h = var2.readUnsignedByte(255) == 1;
			} else if (this.Ac == 4) {
				this.yc = var2.readShort(50);
				if (~this.yc == -65536) {
					this.yc = -1;
				}
				
				this.ob_lb = var2.t(-19405);
				this.anInt_e = var2.readUnsignedByte(255);
				this.J = var2.readUnsignedByte(255);
				this.yb = var2.readUnsignedByte(255);
				this.a = var2.readUnsignedByte(255) == 1;
				this.N = var2.readInt(1029109968);
			} else if (this.Ac == 3) {
				this.N = var2.readInt(1029109968);
				this.eb = ~var2.readUnsignedByte(255) == -2;
				this.kb = var2.readUnsignedByte(255);
			} else if (this.Ac == 9) {
				this.wb = var2.readUnsignedByte(255);
				this.N = var2.readInt(1029109968);
			}
			
			this.v = var2.readUnsignedMedInt(-123);
			this.Mb = var2.t(-19405);
			int var3 = var2.readUnsignedByte(255);
			if (var3 > 0) {
				this.Mc = new ob[var3];
				int var4 = 0;
				if (~var3 < ~var4) {
					do {
						this.Mc[var4] = var2.t(-19405);
						++var4;
					} while (~var3 < ~var4);
				}
			}
			
			this.zb = var2.readUnsignedByte(255);
			this.ic = var2.readUnsignedByte(255);
			this.aBoolean_qc = ~var2.readUnsignedByte(255) == -2;
			this.f = var2.t(-19405);
			this.db = this.a(-1, var2);
			this.y = this.a(-1, var2);
			this.F = this.a(-1, var2);
			this.Db = this.a(-1, var2);
			this.Jb = this.a(-1, var2);
			this.vb = this.a(-1, var2);
			this.Zb = this.a(-1, var2);
			this.pb = this.a(-1, var2);
			this.X = this.a(-1, var2);
			this.A = this.a(-1, var2);
			if (!var1) {
				this.xc = this.a(-1, var2);
				this.objects_ib = this.a(-1, var2);
				this.s = this.a(-1, var2);
				this.Gc = this.a(-1, var2);
				this.G = this.a(-1, var2);
				this.j = this.a(-1, var2);
				this.b = this.a(-1, var2);
				this.Ub = this.a(-1, var2);
				this.l = this.a(var2, (byte) -105);
				this.Q = this.a(var2, (byte) -117);
				this.mb = this.a(var2, (byte) -66);
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "ra.I(" + var1 + ',' + "{...}" + ')');
		}
	}
	
	private int[] a(og var1, byte var2) {
		try {
			++Ib;
			if (var2 > -52) {
				this.Hc = null;
			}
			
			int i = var1.readUnsignedByte(255);
			if (i == 0) {
				return null;
			} else {
				int[] ints = new int[i];
				int index = 0;
				if (i <= index) {
					return ints;
				} else {
					do {
						ints[index] = var1.readInt(1029109968);
						++index;
					} while (i > index);
					
					return ints;
				}
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "ra.F(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}
	
	final kc a(int var1, int var2) {
		try {
			sa.b = false;
			++Z;
			if (~var2 <= -1 && ~this.qb.length < ~var2) {
				int var3 = this.qb[var2];
				if (var3 == -1) {
					return null;
				} else {
					kc var4 = (kc) ci.s.a((long) var3, (byte) 88);
					if (var1 > -2) {
						this.a(false, null);
					}
					
					if (var4 != null) {
						return var4;
					} else {
						var4 = oe.a(sf.cacheFile8, var3, -115, 0);
						if (var4 == null) {
							sa.b = true;
							if (client.anInt_wb == 0) {
								return var4;
							}
						}
						
						ci.s.a(var4, (byte) -114, (long) var3);
						return var4;
					}
				}
			} else {
				return null;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ra.A(" + var1 + ',' + var2 + ')');
		}
	}
	
	static re a(int i, int unused, int id, int var3) {
		try {
			++Cc;
			re var4 = new re();
			var4.B = i;
			var4.w = var3;
			rd.J.a(var4, (long) id, true);
			qd.b(-19597, var3);
			lb.c(var3, -103);
			ra var5 = tc.b(id, -59);
			if (var5 != null) {
				dg.a(var5, -124);
			}
			
			if (sb.Z != null) {
				dg.a(sb.Z, -81);
				sb.Z = null;
			}
			
			le.X = false;
			si.S = 0;
			od.a(th.bb, le.anInt_fb, ud.Zb, hi.k, 2);
			if (~bg.h != 0) {
				vg.a(1, true, bg.h);
			}
			
			return var4;
		} catch (RuntimeException var7) {
			throw bc.a(var7, "ra.J(" + i + ',' + unused + ',' + id + ',' + var3 + ')');
		}
	}
	
	public static void a(int var0) {
		try {
			ec = null;
			scapeMain = null;
			u = null;
			if (var0 != 0) {
				a(null, null, (byte) 34);
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ra.G(" + var0 + ')');
		}
	}
	
	final void a(int var1, ob var2, byte var3) {
		int var6 = client.anInt_wb;
		
		try {
			if (this.Mc == null || ~var1 <= ~this.Mc.length) {
				ob[] var4 = new ob[var1 + 1];
				if (this.Mc != null) {
					int var5 = 0;
					if (var6 != 0 || this.Mc.length > var5) {
						do {
							var4[var5] = this.Mc[var5];
							++var5;
						} while (this.Mc.length > var5);
					}
				}
				
				this.Mc = var4;
			}
			
			this.Mc[var1] = var2;
			++Cb;
			if (var3 != -50) {
				this.a(-109, (fa[]) null);
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "ra.C(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
		}
	}
	
	final kc a(boolean var1, byte var2) {
		try {
			int var3;
			label64:
			{
				++oc;
				sa.b = false;
				if (var1) {
					var3 = this.i;
					if (client.anInt_wb == 0) {
						break label64;
					}
				}
				
				var3 = this.c;
			}
			
			if (var3 == -1) {
				return null;
			} else {
				long var4 = ((long) this.ac << 36) + ((long) var3 - -((!this.P ? 0L : 1L) << 38)) - (-((this.Bc ? 1L : 0L) << 39) - ((long) this.q << 40));
				kc var6 = (kc) ci.s.a(var4, (byte) -34);
				if (var6 != null) {
					return var6;
				} else {
					var6 = oe.a(sf.cacheFile8, var3, -126, 0);
					if (var6 == null) {
						sa.b = true;
						return null;
					} else {
						if (this.P) {
							var6.d();
						}
						
						if (this.Bc) {
							var6.e();
						}
						
						if (var2 != -96) {
							this.Mc = null;
						}
						
						if (this.ac > 0) {
							var6.h(this.ac);
						}
						
						if (~this.ac <= -2) {
							var6.f(1);
						}
						
						if (this.ac >= 2) {
							var6.f(16777215);
						}
						
						if (this.q != 0) {
							var6.g(this.q);
						}
						
						ci.s.a(var6, (byte) -33, var4);
						return var6;
					}
				}
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "ra.D(" + var1 + ',' + var2 + ')');
		}
	}
	
	final boolean b(int var1) {
		int var8 = client.anInt_wb;
		
		try {
			++anInt_sb;
			if (this.Hb != null) {
				return true;
			} else {
				fa var2 = ef.a(var1, (byte) 42, sf.cacheFile8, this.c);
				if (var2 == null) {
					return false;
				} else {
					var2.d();
					this.Hb = new int[var2.N];
					this.Wb = new int[var2.N];
					int var3 = 0;
					if (var8 == 0 && ~var3 <= ~var2.N) {
						return true;
					} else {
						do {
							int var4 = 0;
							int var6 = 0;
							if (var8 != 0 || var6 < var2.Q) {
								do {
									if (var2.R[var3 * var2.Q + var6] == 0) {
										var4 = var6;
										if (var8 == 0) {
											break;
										}
										
										++var6;
									} else {
										++var6;
									}
								} while (var6 < var2.Q);
							}
							
							int var5 = var2.Q;
							int var7 = var4;
							if (var8 != 0 || var2.Q > var4) {
								do {
									if (var2.R[var2.Q * var3 + var7] != 0) {
										var5 = var7;
										if (var8 == 0) {
											break;
										}
										
										++var7;
									} else {
										++var7;
									}
								} while (var2.Q > var7);
							}
							
							this.Hb[var3] = var4;
							this.Wb[var3] = -var4 + var5;
							++var3;
						} while (~var3 > ~var2.N);
						
						return true;
					}
				}
			}
		} catch (RuntimeException var9) {
			throw bc.a(var9, "ra.H(" + var1 + ')');
		}
	}
	
	public ra() {
		this.T = ce.bb;
		this.f = ce.bb;
		this.nb = -1;
		this.ob_lb = ce.bb;
		this.V = false;
		this.a = false;
		this.E = false;
		this.tb = -1;
		this.jb = 0;
		this.gb = 0;
		this.anInt_t = 0;
		this.h = false;
		this.Qb = 0;
		this.Mb = ce.bb;
		this.Lb = 0;
		this.Ob = 0;
		this.Fb = 0;
		this.Nb = 0;
		this.Ab = 0;
		this.Xb = 0;
		this.anInt_cb = 0;
		this.C = 100;
		this.zb = 0;
		this.Kb = 0;
		this.aBoolean_r = false;
		this.ac = 0;
		this.Vb = false;
		this.gc = 0;
		this.B = 0;
		this.Bb = ce.bb;
		this.ob = 1;
		this.q = 0;
		this.hb = 0;
		this.ic = 0;
		this.lc = 0;
		this.yb = 0;
		this.R = false;
		this.J = 0;
		this.rc = 0;
		this.wb = 1;
		this.aBoolean_qc = false;
		this.kb = 0;
		this.Rb = -1;
		this.L = 0;
		this.vc = -1;
		this.sc = rd.L;
		this.o = null;
		this.nc = -1;
		this.uc = 0;
		this.Tb = -1;
		this.eb = false;
		this.Fc = -1;
		this.pc = 0;
		this.anInt_wc = -1;
		this.Y = 0;
		this.anInt_bc = 0;
		this.zc = -1;
		this.Kc = 0;
		this.yc = -1;
		this.Gb = 0;
		this.Jc = 0;
		this.Oc = 0;
		this.Ec = -1;
		this.Nc = 0;
		this.Ic = -1;
	}
}
