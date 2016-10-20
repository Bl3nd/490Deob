import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;

public abstract class na extends Applet implements Runnable, FocusListener, WindowListener {
	
	static int anInt_a;
	static int anInt_b;
	static int anInt_c = 7759444;
	static int anInt_d;
	static int anInt_e;
	static int anInt_f;
	static int anInt_g;
	static int anInt_h;
	static int i;
	static int j;
	static int k;
	static int anInt_l;
	static int anInt_m = 100;
	static ob ob_n = rf.a(40, "Ihr Charakter)2Profil wird in:");
	static int anInt_o;
	static int p;
	static int anInt_q;
	static int anInt_r;
	static int anInt_s;
	static int anInt_t;
	static int u;
	static int anInt_v;
	static int w;
	static int x;
	static int y;
	static int z;
	static int A;
	static int B;
	static int C;
	static int D;
	static int E;
	static int F;
	static ob G = rf.a(40, " <col=ffff00>");
	static int H;
	static int I;
	static int J;
	static int K;
	static int L;
	private boolean M = false;
	public static int N;
	public static boolean O;
	
	static void a(int var0, int var1, int var2, int var3, boolean var4, int var5, int var6, int var7) {
		int var47 = client.anInt_wb;
		
		try {
			int var10 = 0;
			++w;
			int var9 = var6;
			int var8 = 0;
			int var12 = -var1 + var6;
			int var11 = -var1 + var0;
			int var13 = var0 * var0;
			int var15 = var11 * var11;
			int var14 = var6 * var6;
			int var16 = var12 * var12;
			int var17 = var14 << 1;
			int var18 = var13 << 1;
			int var20 = var15 << 1;
			int var19 = var16 << 1;
			int var21 = var6 << 1;
			int var23 = var13 * (1 + -var21) + var17;
			int var22 = var12 << 1;
			int var24 = var14 + -((-1 + var21) * var18);
			int var26 = -((-1 + var22) * var20) + var16;
			int var27 = var13 << 2;
			int var28 = var14 << 2;
			int var25 = var15 * (1 + -var22) - -var19;
			int var29 = var15 << 2;
			int var30 = var16 << 2;
			int var31 = 3 * var17;
			int var32 = (-3 + var21) * var18;
			if (!var4) {
				int var34 = var20 * (var22 + -3);
				int var33 = 3 * var19;
				int var35 = var28;
				int var37 = var30;
				int var38 = var29 * (var12 - 1);
				int var36 = (-1 + var6) * var27;
				int[] var39 = e.ints_b[var2];
				sa.a(var5 - var11, (byte) 52, var5 + -var0, var3, var39);
				sa.a(var11 + var5, (byte) 52, var5 - var11, var7, var39);
				sa.a(var0 + var5, (byte) 52, var5 + var11, var3, var39);
				if (var47 != 0 || ~var6 < -1) {
					do {
						if (~var23 > -1 && (var47 != 0 || ~var23 > -1)) {
							do {
								++var8;
								var23 += var31;
								var31 += var28;
								var24 += var35;
								var35 += var28;
							} while (~var23 > -1);
						}
						
						if (var24 < 0) {
							++var8;
							var23 += var31;
							var24 += var35;
							var35 += var28;
							var31 += var28;
						}
						
						var24 += -var32;
						var23 += -var36;
						var36 -= var27;
						var32 -= var27;
						int var43 = var8 + var5;
						int var44 = -var8 + var5;
						boolean var40 = var12 >= var9;
						if (var40) {
							if (var25 < 0 && (var47 != 0 || ~var25 > -1)) {
								do {
									var26 += var37;
									++var10;
									var37 += var30;
									var25 += var33;
									var33 += var30;
								} while (~var25 > -1);
							}
							
							if (var26 < 0) {
								++var10;
								var25 += var33;
								var33 += var30;
								var26 += var37;
								var37 += var30;
							}
							
							var25 += -var38;
							var26 += -var34;
							var34 -= var29;
							var38 -= var29;
						}
						
						--var9;
						int var42 = var9 + var2;
						int var41 = -var9 + var2;
						if (!var40) {
							sa.a(var43, (byte) 52, var44, var3, e.ints_b[var41]);
							sa.a(var43, (byte) 52, var44, var3, e.ints_b[var42]);
							if (var47 == 0) {
								continue;
							}
						}
						
						int var46 = var5 - var10;
						sa.a(var46, (byte) 52, var44, var3, e.ints_b[var41]);
						int var45 = var10 + var5;
						sa.a(var45, (byte) 52, var46, var7, e.ints_b[var41]);
						sa.a(var43, (byte) 52, var45, var3, e.ints_b[var41]);
						sa.a(var46, (byte) 52, var44, var3, e.ints_b[var42]);
						sa.a(var45, (byte) 52, var46, var7, e.ints_b[var42]);
						sa.a(var43, (byte) 52, var45, var3, e.ints_b[var42]);
					} while (~var9 < -1);
					
				}
			}
		} catch (RuntimeException var48) {
			throw bc.a(var48, "na.U(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
		}
	}
	
	abstract void a(int var1);
	
	public final void start() {
		try {
			++H;
			if (gg.k == this && !cc.H) {
				cf.Z = 0L;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "na.start(" + ')');
		}
	}
	
	private void b(int var1) {
		try {
			++F;
			long var4 = qd.J[nd.j];
			if (var1 == -6549) {
				long var2 = a.a((byte) -56);
				boolean var10000;
				if (var4 != 0L && var2 > var4) {
					var10000 = true;
				} else {
					var10000 = false;
				}
				
				qd.J[nd.j] = var2;
				nd.j = nd.j - -1 & 31;
				synchronized (this) {
					lb.nb = uc.nb;
				}
				
				this.a(70);
			}
		} catch (RuntimeException var10) {
			throw bc.a(var10, "na.V(" + var1 + ')');
		}
	}
	
	final synchronized void a(boolean var1) {
		int var4 = client.anInt_wb;
		
		try {
			Object var2;
			label28:
			{
				if (v.frame == null) {
					var2 = gi.y.m;
					if (var4 == 0) {
						break label28;
					}
				}
				
				var2 = v.frame;
			}
			
			if (rg.canvas_t != null) {
				rg.canvas_t.removeFocusListener(this);
				((Container) var2).remove(rg.canvas_t);
			}
			
			label22:
			{
				rg.canvas_t = new pc(this);
				((Container) var2).add(rg.canvas_t);
				++anInt_b;
				rg.canvas_t.setSize(l.m, bg.anInt_d);
				rg.canvas_t.setVisible(true);
				if (v.frame != null) {
					Insets var3 = v.frame.getInsets();
					rg.canvas_t.setLocation(var3.left, var3.top);
					if (var4 == 0) {
					}
				}
				
				rg.canvas_t.setLocation(0, 0);
			}
			
			rg.canvas_t.addFocusListener(this);
			rg.canvas_t.requestFocus();
			ke.sb = true;
			bg.j = var1;
			ob.T = a.a((byte) -105);
		} catch (RuntimeException var5) {
			throw bc.a(var5, "na.EA(" + var1 + ')');
		}
	}
	
	public final void windowClosed(WindowEvent var1) {
		try {
			++y;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "na.windowClosed(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	abstract void a(byte var1);
	
	public final URL getCodeBase() {
		++anInt_l;
		return v.frame != null ? null : (gi.y != null && this != gi.y.m ? gi.y.m.getCodeBase() : super.getCodeBase());
	}
	
	public final void stop() {
		try {
			++anInt_e;
			if (this == gg.k && !cc.H) {
				cf.Z = a.a((byte) -102) + 4000L;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "na.stop(" + ')');
		}
	}
	
	abstract void b(boolean var1);
	
	final void a(int storeId, String gameName, int height, int unused, int width, int version, int idxCount) {
		try {
			++E;
			
			try {
				gg.k = this;
				bg.anInt_d = height;
				l.m = width;
				ib.i = version;
				v.frame = new Frame();
				v.frame.setTitle("Jagex");
				v.frame.setResizable(false);
				v.frame.addWindowListener(this);
				v.frame.setVisible(true);
				v.frame.toFront();
				Insets insets = v.frame.getInsets();
				v.frame.setSize(insets.right + width + insets.left, insets.bottom + height + insets.top);
				lf.v = gi.y = new t(true, null, storeId, gameName, idxCount);
				gi.y.a(3360, 1, this);
			} catch (Exception var9) {
				ra.a(null, var9, (byte) 80);
			}
		} catch (RuntimeException var10) {
			throw bc.a(var10, "na.S(" + storeId + ',' + (gameName != null ? "{...}" : "null") + ',' + height + ',' + 1 + ',' + width + ',' + version + ',' + idxCount + ')');
		}
	}
	
	public final void focusGained(FocusEvent var1) {
		try {
			++i;
			uc.nb = true;
			ke.sb = true;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "na.focusGained(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	public final void windowDeactivated(WindowEvent var1) {
		try {
			++k;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "na.windowDeactivated(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	public static void providesignlink(t var0) {
		try {
			++p;
			gi.y = var0;
			lf.v = var0;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "na.providesignlink(" + (var0 != null ? "{...}" : "null") + ')');
		}
	}
	
	public final void windowActivated(WindowEvent var1) {
		try {
			++anInt_d;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "na.windowActivated(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	public final AppletContext getAppletContext() {
		try {
			++anInt_t;
			return v.frame != null ? null : (gi.y != null && gi.y.m != this ? gi.y.m.getAppletContext() : super.getAppletContext());
		} catch (RuntimeException var2) {
			throw bc.a(var2, "na.getAppletContext(" + ')');
		}
	}
	
	public final void windowOpened(WindowEvent var1) {
		try {
			++j;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "na.windowOpened(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	abstract void c(int var1);
	
	public static void d(int var0) {
		try {
			G = null;
			ob_n = null;
			if (var0 != 1000) {
				ob_n = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "na.FA(" + var0 + ')');
		}
	}
	
	static void a(byte var0, long var1) {
		int var6 = client.anInt_wb;
		
		try {
			++K;
			if (var1 != 0L) {
				if ((~ii.o > -101 || n.k == 1) && ~ii.o > -201) {
					ob var3 = ug.a(var1, var0 + 74).a((int) 22);
					int var4 = 0;
					if (var6 != 0 || ~var4 > ~ii.o) {
						do {
							if (nb.hc[var4] == var1) {
								nb.a(0, (byte) -110, lb.T, wc.a(new ob[] {var3, g.isAlreadyOnYourFriendList2}, var0 ^ 75));
								return;
							}
							
							++var4;
						} while (~var4 > ~ii.o);
					}
					
					int var5 = 0;
					if (var6 != 0) {
						if (var1 == pe.db[var5]) {
							nb.a(0, (byte) -102, lb.T, wc.a(new ob[] {tb.pleaseRemove3, var3, pi.d}, -3));
							return;
						}
						
						++var5;
					}
					
					while (~jg.s < ~var5) {
						if (var1 == pe.db[var5]) {
							nb.a(0, (byte) -102, lb.T, wc.a(new ob[] {tb.pleaseRemove3, var3, pi.d}, -3));
							return;
						}
						
						++var5;
					}
					
					if (var3.a((byte) 31, le.T.Ic)) {
						nb.a(0, (byte) -116, lb.T, wc.youCantAddYourselfFriendsList2);
					} else {
						si.V[ii.o] = var3;
						++h.ob;
						nb.hc[ii.o] = var1;
						kd.W[ii.o] = 0;
						cd.n[ii.o] = lb.T;
						if (var0 != -74) {
							ob_n = null;
						}
						
						ud.gc[ii.o] = 0;
						a.k = re.D;
						++ii.o;
						af.P.p(231, var0 + 12959);
						af.P.writeLong((int) -105, var1);
					}
				} else {
					nb.a(0, (byte) -117, lb.T, hf.b);
				}
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "na.DA(" + var0 + ',' + var1 + ')');
		}
	}
	
	public final void run() {
		int var3 = client.anInt_wb;
		System.err.println("Method run() [Class na]");
		
		try {
			++L;
			
			try {
				label106:
				{
					if (t.javaVendor != null) {
						String vendor = t.javaVendor.toLowerCase();
						if (!vendor.contains("sun") && ~vendor.indexOf("apple") == 0) {
							if (~vendor.indexOf("ibm") != 0 && (t.javaVersion == null || t.javaVersion.equals("1.4.2"))) {
								this.a(-119, "wrongjava");
								return;
							}
						} else {
							String version = t.javaVersion;
							if (version.equals("1.1") || version.startsWith("1.1.") || version.equals("1.2") || version.startsWith("1.2.")) {
								this.a(43, "wrongjava");
								return;
							}
							
							dd.i = 5;
						}
					}
					
					if (gi.y.m != null) {
						Method setFocusCycleRoot = t.setFocusCycleRoot;
						if (setFocusCycleRoot != null) {
							try {
								setFocusCycleRoot.invoke(gi.y.m, Boolean.TRUE);
							} catch (Throwable throwable) {
								throwable.printStackTrace();
							}
						}
					}
					
					this.a(false);
					wb.V = qb.a(bg.anInt_d, l.m, 100, rg.canvas_t);
					this.c(0);
					qa.p = nc.a(107);
					int var8;
					while (true) {
						var8 = 0;
						while (var8 < ng.r) {
							this.b(-6549);
							++var8;
						}
						
						this.d((byte) 21);
						kd.a(gi.y, rg.canvas_t, (byte) 2);
						if (~cf.Z != -1L && ~cf.Z >= ~a.a((byte) -57)) {
							break;
						}
						
						ng.r = qa.p.a(-100, dd.i, lb.S);
					}
				}
			} catch (Exception e) {
				ra.a(null, e, (byte) -128);
				this.a(59, "crash");
			}
			
			this.a(-118, true);
		} catch (RuntimeException var6) {
			throw bc.a(var6, "na.run(" + ')');
		}
	}
	
	abstract void b(byte var1);
	
	private void a(int var1, boolean var2) {
		try {
			++anInt_g;
			synchronized (this) {
				if (cc.H) {
					return;
				}
				
				cc.H = true;
			}
			
			if (gi.y.m != null) {
				gi.y.m.destroy();
			}
			
			if (rg.canvas_t != null) {
				try {
					rg.canvas_t.removeFocusListener(this);
					Object var4;
					if (v.frame != null) {
						var4 = v.frame;
					} else {
						var4 = gi.y.m;
					}
					
					((Container) var4).remove(rg.canvas_t);
				} catch (Exception var15) {
					var15.printStackTrace();
				}
			}
			
			try {
				this.a((byte) -94);
			} catch (Exception var14) {
				var14.printStackTrace();
			}
			
			if (gi.y != null) {
				try {
					gi.y.a(true);
				} catch (Exception var13) {
					var13.printStackTrace();
				}
			}
			
			this.b((byte) -68);
			if (v.frame != null) {
				try {
					System.exit(0);
				} catch (Throwable var12) {
					var12.printStackTrace();
				}
			}
			
			System.out.println("Shutdown complete - clean:" + var2);
		} catch (RuntimeException var17) {
			throw bc.a(var17, "na.GA(" + var1 + ',' + var2 + ')');
		}
	}
	
	public final synchronized void paint(Graphics var1) {
		try {
			++anInt_f;
			if (gg.k == this && !cc.H) {
				ke.sb = true;
				if (t.javaVersion != null && t.javaVersion.startsWith("1.5") && ~(a.a((byte) -89) - ob.T) < -1001L) {
					Rectangle var2 = var1.getClipBounds();
					if (var2 == null || l.m <= var2.width && ~var2.height <= ~bg.anInt_d) {
						bg.j = true;
					}
					
				}
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "na.paint(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	public final void windowDeiconified(WindowEvent var1) {
		try {
			++z;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "na.windowDeiconified(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	public final void destroy() {
		try {
			++J;
			if (gg.k == this && !cc.H) {
				cf.Z = a.a((byte) -109);
				jd.a(5000L, (byte) -8);
				lf.v = null;
				this.a(103, false);
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "na.destroy(" + ')');
		}
	}
	
	static void c(byte unused) {
		int dummy = client.anInt_wb;
		
		try {
			re var1 = (re) rd.J.b((byte) 117);
			int var2;
			if (var1 == null) {
				var2 = -19 % ((unused - 49) / 43);
				++D;
			} else {
				label75:
				do {
					var2 = var1.w;
					if (!gf.a(true, var2)) {
						var1 = (re) rd.J.a((byte) -33);
					} else {
						boolean var3 = true;
						ra[] var4 = wg.cb[var2];
						int var5 = 0;
						int var6;
						ra var7;
						if (~var4.length >= ~var5) {
							if (!var3) {
								int clientScriptId = (int) var1.clientScriptId;
								var7 = tc.b(clientScriptId, -83);
								if (var7 != null) {
									dg.a(var7, -81);
								}
							}
							
							var1 = (re) rd.J.a((byte) -33);
						} else {
							do {
								if (var4[var5] != null) {
									var3 = var4[var5].R;
									if (dummy == 0) {
										if (!var3) {
											int clientScriptId = (int) var1.clientScriptId;
											var7 = tc.b(clientScriptId, (int) -83);
											if (var7 != null) {
												dg.a(var7, -81);
											}
										}
										
										var1 = (re) rd.J.a((byte) -33);
										continue label75;
									}
									
									++var5;
								} else {
									++var5;
								}
							} while (~var4.length < ~var5);
							
							if (!var3) {
								int clientScriptId = (int) var1.clientScriptId;
								var7 = tc.b(clientScriptId, -83);
								if (var7 != null) {
									dg.a(var7, -81);
								}
							}
							
							var1 = (re) rd.J.a((byte) -33);
						}
					}
				} while (var1 != null);
				
				var2 = -19 % ((unused - 49) / 43);
				++D;
			}
		} catch (RuntimeException var9) {
			throw bc.a(var9, "na.W(" + unused + ')');
		}
	}
	
	public final URL getDocumentBase() {
		try {
			++anInt_h;
			return v.frame != null ? null : (gi.y != null && this != gi.y.m ? gi.y.m.getDocumentBase() : super.getDocumentBase());
		} catch (RuntimeException var2) {
			throw bc.a(var2, "na.getDocumentBase(" + ')');
		}
	}
	
	static boolean a(int var0, ob var1) {
		int var3 = client.anInt_wb;
		
		try {
			++anInt_r;
			if (var1 == null) {
				return false;
			} else {
				if (var0 != 31) {
					anInt_m = -90;
				}
				
				int var2 = 0;
				if (var3 == 0 && var2 >= jg.s) {
					return false;
				} else {
					do {
						if (var1.b((byte) -79, qg.i[var2])) {
							return true;
						}
						
						++var2;
					} while (var2 < jg.s);
					
					return false;
				}
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "na.R(" + var0 + ',' + "{...}" + ')');
		}
	}
	
	final void a(int var1, String var2) {
		try {
			++anInt_q;
			if (!this.M) {
				this.M = true;
				System.out.println("error_game_" + var2);
				
				try {
					this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var2 + ".ws"), "_self");
					int var3 = 54 % ((var1 - -27) / 52);
				} catch (Exception var4) {
					var4.printStackTrace();
				}
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "na.T(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}
	
	public final void update(Graphics var1) {
		try {
			this.paint(var1);
			++x;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "na.update(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	static void a(kb var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var0.k.length;
		
		int var9;
		int var10;
		int var11;
		int var12;
		for (int var8 = 0; var8 < var7; ++var8) {
			var9 = var0.k[var8] - bg.b;
			var10 = var0.p[var8] - qc.A;
			var11 = var0.c[var8] - dd.m;
			var12 = var11 * var3 + var9 * var4 >> 16;
			var11 = var11 * var4 - var9 * var3 >> 16;
			var9 = var12;
			var12 = var10 * var2 - var11 * var1 >> 16;
			var11 = var10 * var1 + var11 * var2 >> 16;
			if (var11 < 50) {
				return;
			}
			
			if (var0.u != null) {
				kb.s[var8] = var9;
				kb.e[var8] = var12;
				kb.t[var8] = var11;
			}
			
			kb.g[var8] = ec.P + (var9 << 9) / var11;
			kb.r[var8] = ec.M + (var12 << 9) / var11;
		}
		
		ec.N = 0;
		var7 = var0.b.length;
		
		for (var9 = 0; var9 < var7; ++var9) {
			var10 = var0.b[var9];
			var11 = var0.o[var9];
			var12 = var0.i[var9];
			int var13 = kb.g[var10];
			int var14 = kb.g[var11];
			int var15 = kb.g[var12];
			int var16 = kb.r[var10];
			int var17 = kb.r[var11];
			int var18 = kb.r[var12];
			if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
				if (cf.Y && s.a(da.Bb, client.anInt_lb, var16, var17, var18, var13, var14, var15)) {
					uc.mb = var5;
					cf.R = var6;
				}
				
				ec.K = false;
				if (var13 < 0 || var14 < 0 || var15 < 0 || var13 > ec.R || var14 > ec.R || var15 > ec.R) {
					ec.K = true;
				}
				
				if (var0.u != null && var0.u[var9] != -1) {
					if (!ch.Z) {
						if (var0.v) {
							ec.a(var16, var17, var18, var13, var14, var15, var0.n[var9], var0.q[var9], var0.a[var9], kb.s[0], kb.s[1], kb.s[3], kb.e[0], kb.e[1], kb.e[3], kb.t[0], kb.t[1], kb.t[3], var0.u[var9]);
						} else {
							ec.a(var16, var17, var18, var13, var14, var15, var0.n[var9], var0.q[var9], var0.a[var9], kb.s[var10], kb.s[var11], kb.s[var12], kb.e[var10], kb.e[var11], kb.e[var12], kb.t[var10], kb.t[var11], kb.t[var12], var0.u[var9]);
						}
					} else {
						int var19 = ec.Z.c(var0.u[var9], -30480);
						ec.a(var16, var17, var18, var13, var14, var15, ce.b(var19, var0.n[var9]), ce.b(var19, var0.q[var9]), ce.b(var19, var0.a[var9]));
					}
				} else if (var0.n[var9] != 12345678) {
					ec.a(var16, var17, var18, var13, var14, var15, var0.n[var9], var0.q[var9], var0.a[var9]);
				}
			}
		}
		
	}
	
	private void d(byte var1) {
		try {
			++anInt_s;
			long var2 = a.a((byte) -102);
			long var4 = vc.q[fh.b];
			vc.q[fh.b] = var2;
			fh.b = 1 + fh.b & 31;
			if (var4 != 0L && ~var4 > ~var2) {
				int var6 = (int) (var2 - var4);
				di.i = ((var6 >> 1) + 32000) / var6;
			}
			
			if (ah.w++ > 50) {
				ah.w -= 50;
				ke.sb = true;
				rg.canvas_t.setSize(l.m, bg.anInt_d);
				rg.canvas_t.setVisible(true);
				if (v.frame != null) {
					Insets insets = v.frame.getInsets();
					rg.canvas_t.setLocation(insets.left, insets.top);
				} else {
					rg.canvas_t.setLocation(0, 0);
				}
			}
			
			if (var1 != 21) {
				G = null;
			}
			
			this.b(true);
		} catch (RuntimeException var7) {
			throw bc.a(var7, "na.CA(" + var1 + ')');
		}
	}
	
	public final void windowClosing(WindowEvent var1) {
		try {
			this.destroy();
			++anInt_a;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "na.windowClosing(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	public final String getParameter(String var1) {
		try {
			++u;
			return v.frame != null ? null : (gi.y != null && gi.y.m != this ? gi.y.m.getParameter(var1) : super.getParameter(var1));
		} catch (RuntimeException var3) {
			throw bc.a(var3, "na.getParameter(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	public abstract void init();
	
	final void a(int var1, int var2, int var3, int var4, int var5) {
		try {
			if (var3 != 26340) {
				this.a((byte) 88);
			}
			
			++A;
			
			try {
				if (gg.k != null) {
					++tb.k;
					if (tb.k >= 3) {
						this.a(var3 ^ 26267, "alreadyloaded");
					} else {
						this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
					}
				} else {
					ib.i = var2;
					gg.k = this;
					l.m = var1;
					bg.anInt_d = var5;
					if (gi.y == null) {
						lf.v = gi.y = new t(false, this, var4, (String) null, 0);
					}
					
					gi.y.a(3360, 1, this);
				}
			} catch (Exception var7) {
				ra.a((String) null, var7, (byte) -59);
				this.a(var3 + -26461, "crash");
			}
		} catch (RuntimeException var8) {
			throw bc.a(var8, "na.BA(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
		}
	}
	
	public final void windowIconified(WindowEvent var1) {
		try {
			++B;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "na.windowIconified(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	public final void focusLost(FocusEvent var1) {
		try {
			uc.nb = false;
			++anInt_o;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "na.focusLost(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	final boolean e(int var1) {
		try {
			++anInt_v;
			String var2 = this.getDocumentBase().getHost().toLowerCase();
			if (!var2.equals("jagex.com") && !var2.endsWith(".jagex.com")) {
				if (var1 != 0) {
					this.run();
				}
				
				if (!var2.equals("runescape.com") && !var2.endsWith(".runescape.com")) {
					if (var2.endsWith("127.0.0.1")) {
						return true;
					} else {
						while (var2.length() > 0 && var2.charAt(-1 + var2.length()) >= 48 && ~var2.charAt(var2.length() - 1) >= -58) {
							var2 = var2.substring(0, -1 + var2.length());
						}
						
						if (var2.endsWith("192.168.1.")) {
							return true;
						} else {
							this.a(-84, (String) "invalidhost");
							return false;
						}
					}
				} else {
					return true;
				}
			} else {
				return true;
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "na.Q(" + var1 + ')');
		}
	}
}
