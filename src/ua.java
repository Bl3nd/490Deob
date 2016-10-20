import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

final class ua implements MouseListener, MouseMotionListener, FocusListener {
	
	static ki[] kis_a = new ki[4];
	static int b;
	static ob c;
	static int d;
	private static ob ob_e = rf.a(40, "Loading)3)3)3");
	static int f;
	static int g;
	static ob h = rf.a(40, "zur-Uck auf die RuneScape)2Webseite gehen");
	static int i;
	static int j;
	static int k;
	static int l;
	static int m;
	static ob n = rf.a(40, "Benutzen Sie bitte eine andere Welt)3");
	static int o;
	static int p;
	static int q;
	static ob r = rf.a(40, "Unerwartete Antwort vom Anmelde)2Server");
	
	public final synchronized void focusLost(FocusEvent var1) {
		try {
			++m;
			if (vc.g != null) {
				fi.l = 0;
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ua.focusLost(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	public final void focusGained(FocusEvent var1) {
		try {
			++o;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ua.focusGained(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	static void a(fa var0, int var1) {
		int var12 = client.anInt_wb;
		
		try {
			int var3 = 0;
			if (var12 != 0) {
				oc.h[var3] = 0;
				++var3;
			}
			
			while (~var3 > ~oc.h.length) {
				oc.h[var3] = 0;
				++var3;
			}
			
			++i;
			short var2 = 256;
			if (var1 == 29499) {
				int var4 = 0;
				int var5;
				if (var12 != 0 || var4 < 5000) {
					do {
						var5 = (int) ((double) var2 * Math.random() * 128.0D);
						oc.h[var5] = (int) (256.0D * Math.random());
						++var4;
					} while (var4 < 5000);
				}
				
				var5 = 0;
				int var6;
				int var7;
				int var8;
				int var9;
				int var10;
				int var11;
				if (var12 == 0 && ~var5 <= -21) {
					if (var0 != null) {
						var6 = 0;
						var7 = 0;
						if (var12 != 0 || ~var0.N < ~var7) {
							do {
								var8 = 0;
								if (var12 != 0 || ~var8 > ~var0.Q) {
									do {
										if (~var0.R[var6++] != -1) {
											var10 = var0.L + (var7 - -16);
											var9 = var8 + (16 - -var0.P);
											var11 = (var10 << 7) + var9;
											oc.h[var11] = 0;
										}
										
										++var8;
									} while (~var8 > ~var0.Q);
								}
								
								++var7;
							} while (~var0.N < ~var7);
							
						}
					}
				} else {
					do {
						label161:
						{
							var6 = 1;
							if (var12 != 0) {
								var7 = 1;
								if (var12 != 0) {
									var8 = var7 + (var6 << 7);
									lb.bb[var8] = (oc.h[var8 - 128] + (oc.h[1 + var8] + oc.h[var8 + -1] - -oc.h[128 + var8])) / 4;
									++var7;
								}
							} else {
								if (var2 + -1 <= var6) {
									break label161;
								}
								
								var7 = 1;
								if (var12 != 0) {
									var8 = var7 + (var6 << 7);
									lb.bb[var8] = (oc.h[var8 - 128] + (oc.h[1 + var8] + oc.h[var8 + -1] - -oc.h[128 + var8])) / 4;
									++var7;
								}
							}
							
							while (true) {
								while (~var7 > -128) {
									var8 = var7 + (var6 << 7);
									lb.bb[var8] = (oc.h[var8 - 128] + (oc.h[1 + var8] + oc.h[var8 + -1] - -oc.h[128 + var8])) / 4;
									++var7;
								}
								
								++var6;
								if (var2 + -1 <= var6) {
									break;
								}
								
								var7 = 1;
								if (var12 != 0) {
									var8 = var7 + (var6 << 7);
									lb.bb[var8] = (oc.h[var8 - 128] + (oc.h[1 + var8] + oc.h[var8 + -1] - -oc.h[128 + var8])) / 4;
									++var7;
								}
							}
						}
						
						int[] var14 = oc.h;
						oc.h = lb.bb;
						lb.bb = var14;
						++var5;
					} while (~var5 > -21);
					
					if (var0 != null) {
						var6 = 0;
						var7 = 0;
						if (var12 != 0 || ~var0.N < ~var7) {
							do {
								var8 = 0;
								if (var12 != 0 || ~var8 > ~var0.Q) {
									do {
										if (~var0.R[var6++] != -1) {
											var10 = var0.L + (var7 - -16);
											var9 = var8 + (16 - -var0.P);
											var11 = (var10 << 7) + var9;
											oc.h[var11] = 0;
										}
										
										++var8;
									} while (~var8 > ~var0.Q);
								}
								
								++var7;
							} while (~var0.N < ~var7);
							
						}
					}
				}
			}
		} catch (RuntimeException var13) {
			throw bc.a(var13, "ua.C(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}
	
	static void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var15 = client.anInt_wb;
		
		try {
			int var7 = var5 + var1;
			++p;
			int var11 = var1;
			if (var15 != 0) {
				sa.a(var6, (byte) 52, var2, var0, e.ints_b[var1]);
				var11 = var1 + 1;
			}
			
			while (var7 > var11) {
				sa.a(var6, (byte) 52, var2, var0, e.ints_b[var11]);
				++var11;
			}
			
			int var10 = var6 - var5;
			if (var3 != 3963) {
				a(44, 0, 96, -57, 92, -113, 42);
			}
			
			int var8 = -var5 + var4;
			int var9 = var2 + var5;
			int var12 = var4;
			if (var15 != 0 || var4 > var8) {
				do {
					sa.a(var6, (byte) 52, var2, var0, e.ints_b[var12]);
					--var12;
				} while (var12 > var8);
			}
			
			int var13 = var7;
			if (var15 != 0 || ~var7 >= ~var8) {
				do {
					int[] var14 = e.ints_b[var13];
					sa.a(var9, (byte) 52, var2, var0, var14);
					sa.a(var6, (byte) 52, var10, var0, var14);
					++var13;
				} while (~var13 >= ~var8);
				
			}
		} catch (RuntimeException var16) {
			throw bc.a(var16, "ua.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
		}
	}
	
	public final synchronized void mouseMoved(MouseEvent var1) {
		try {
			if (vc.g != null) {
				ni.ab = 0;
				ff.bb = var1.getX();
				client.anInt_qb = var1.getY();
			}
			
			++l;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ua.mouseMoved(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	public final synchronized void mousePressed(MouseEvent var1) {
		try {
			if (vc.g != null) {
				ni.ab = 0;
				ja.b = var1.getX();
				md.h = var1.getY();
				hf.aLong_e = a.a((byte) -105);
				if (var1.isMetaDown()) {
					ra.Eb = 2;
					fi.l = 2;
				} else {
					ra.Eb = 1;
					fi.l = 1;
				}
			}
			
			if (var1.isPopupTrigger()) {
				var1.consume();
			}
			
			++q;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ua.mousePressed(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	public final void mouseClicked(MouseEvent var1) {
		try {
			++j;
			if (var1.isPopupTrigger()) {
				var1.consume();
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ua.mouseClicked(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	public final synchronized void mouseEntered(MouseEvent var1) {
		try {
			if (vc.g != null) {
				ni.ab = 0;
				ff.bb = var1.getX();
				client.anInt_qb = var1.getY();
			}
			
			++g;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ua.mouseEntered(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	public final synchronized void mouseReleased(MouseEvent var1) {
		try {
			if (vc.g != null) {
				ni.ab = 0;
				fi.l = 0;
			}
			
			if (var1.isPopupTrigger()) {
				var1.consume();
			}
			
			++k;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ua.mouseReleased(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	public final synchronized void mouseExited(MouseEvent var1) {
		try {
			++f;
			if (vc.g != null) {
				ni.ab = 0;
				ff.bb = -1;
				client.anInt_qb = -1;
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ua.mouseExited(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	public static void a(boolean var0) {
		try {
			kis_a = null;
			if (var0) {
				c = null;
				n = null;
				ob_e = null;
				h = null;
				r = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ua.B(" + var0 + ')');
		}
	}
	
	public final synchronized void mouseDragged(MouseEvent var1) {
		try {
			++b;
			if (vc.g != null) {
				ni.ab = 0;
				ff.bb = var1.getX();
				client.anInt_qb = var1.getY();
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ua.mouseDragged(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	static {
		c = ob_e;
	}
}
