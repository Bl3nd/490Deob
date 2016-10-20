import java.awt.Component;
import java.lang.reflect.Method;
import java.util.Arrays;

final class mg {
	
	static n a;
	static ob b = rf.a(40, ": ");
	static ob c = rf.a(40, "<col=ff7000>");
	static ob d;
	static int e;
	static int f = 0;
	private static ob loadingInterfaces = rf.a(40, "Loading interfaces )2 ");
	static sh h;
	static int i = 5063219;
	static int j;
	static int k;
	private static ob l;
	static ob loadingInterfaces2;
	static ob n;
	
	static void a(int var0, Component component) {
		try {
			if (var0 != 0) {
				h = null;
			}
			
			++j;
			Method setFocusTraversalKeysEnabled = t.setFocusTraversalKeysEnabled;
			if (setFocusTraversalKeysEnabled != null) {
				try {
					setFocusTraversalKeysEnabled.invoke(component, Boolean.FALSE);
				} catch (Throwable throwable) {
					throwable.printStackTrace();
				}
			}
			
			component.addKeyListener(pa.a);
			component.addFocusListener(pa.a);
		} catch (RuntimeException var4) {
			throw bc.a(var4, "mg.A(" + var0 + ',' + (component != null ? "{...}" : "null") + ')');
		}
	}
	
	static void a(int mask, dg class_dg, int index, boolean var3) {
		int dummy = client.anInt_wb;
		
		try {
			++k;
			int var4;
			int var5;
			if (~(mask & 8) != -1) {
				System.err.println("Mask 1");
				var4 = pg.packetBuffer.readUnsignedLEShortA((byte) 110);
				var5 = pg.packetBuffer.readUnsignedByte(255);
				int var6 = pg.packetBuffer.readUnsignedByte(255);
				int var7 = pg.packetBuffer.pointer;
				if (class_dg.Ic != null && class_dg.Ac != null) {
					long var8 = class_dg.Ic.e(19790);
					boolean var10 = false;
					if (~var5 >= -2) {
						int var11 = 0;
						if (jg.s > var11) {
							do {
								if (~pe.db[var11] == ~var8) {
									var10 = true;
									break;
								}
								
								++var11;
							} while (jg.s > var11);
						}
					}
					
					if (!var10 && bh.c == 0) {
						eb.S.pointer = 0;
						pg.packetBuffer.readBytes(var6, 0, 115, eb.S.buffer);
						eb.S.pointer = 0;
						ob var16 = nh.a(s.a(eb.S, true).h((byte) -43));
						class_dg.Bb = var16.d(38);
						class_dg.Vb = 150;
						class_dg.anInt_ob = 255 & var4;
						class_dg.ac = var4 >> 8;
						if (var5 != 2 && var5 != 3) {
							if (var5 != 1) {
								nb.a(2, (byte) -95, class_dg.Ic, var16);
							} else {
								nb.a(1, (byte) -115, wc.a(new ob[] {v.cb, class_dg.Ic}, -3), var16);
							}
						} else {
							nb.a(1, (byte) -119, wc.a(new ob[] {ib.d, class_dg.Ic}, -3), var16);
						}
					}
				}
				
				pg.packetBuffer.pointer = var7 - -var6;
			}
			
			if (~(mask & 2) != -1) {
				System.err.println("Mask 2");
				var4 = pg.packetBuffer.readUnsignedShortA((byte) -45);
				if (~var4 == -65536) {
					var4 = -1;
				}
				
				var5 = pg.packetBuffer.readUByteC((byte) -127);
				ig.a(var4, 0, var5, class_dg);
			}
			
			if ((mask & 1024) != 0) {
				System.err.println("Mask 3");
				class_dg.O = pg.packetBuffer.readUnsignedShort((byte) -116);
				var4 = pg.packetBuffer.readInt_V1((byte) -70);
				class_dg.Q = var4 >> 16;
				class_dg.dc = bi.f + (var4);
				class_dg.Sb = 0;
				class_dg.Z = 0;
				if (~bi.f > ~class_dg.dc) {
					class_dg.Sb = -1;
				}
				
				if (class_dg.O == '\uffff') {
					class_dg.O = -1;
				}
			}
			
			if ((128 & mask) != 0) {
				System.err.println("Mask 4");
				class_dg.Bb = pg.packetBuffer.t(-19405);
				if (class_dg.Bb.a(125, 0) != 126) {
					if (le.T == class_dg) {
						nb.a(2, (byte) -96, class_dg.Ic, class_dg.Bb);
					}
				} else {
					class_dg.Bb = class_dg.Bb.a((byte) 122, (int) 1);
					nb.a(2, (byte) -96, class_dg.Ic, class_dg.Bb);
				}
				
				class_dg.ac = 0;
				class_dg.Vb = 150;
				class_dg.anInt_ob = 0;
			}
			
			if (~(64 & mask) != -1) {
				System.err.println("Mask 5");
				class_dg.Mb = pg.packetBuffer.readUnsignedShortA((byte) 88);
				if (~class_dg.Mb == -65536) {
					class_dg.Mb = -1;
				}
			}
			
			if (~(512 & mask) != -1) {
				System.err.println("Mask 6");
				var4 = pg.packetBuffer.readUnsignedByte(255);
				var5 = pg.packetBuffer.readUnsignedByte(255);
				class_dg.b(var4, bi.f, var5, !var3);
			}
			
			if (~(0x20 & mask) != -1) {
				System.err.println("Mask 7");
				int position = pg.packetBuffer.readUnsignedByte(255);
				byte[] data = new byte[position];
				System.out.println("Data: " + Arrays.toString(data).length());
				og class_og = new og(data);
				pg.packetBuffer.a(0, data, position, false);
				bc.lb[index] = class_og;
				class_dg.a(-25014, class_og);
			}
			
			if (~(mask & 0x10) != -1) {
				System.err.println("Mask 8");
				var4 = pg.packetBuffer.readUnsignedByteS(-8544);
				var5 = pg.packetBuffer.readUnsignedByte(255);
				class_dg.b(var4, bi.f, var5, !var3);
				class_dg.Pb = 300 + bi.f;
				class_dg.yb = pg.packetBuffer.readUByteC((byte) -127);
			}
			
			if ((256 & mask) != 0) {
				System.err.println("Mask 9");
				class_dg.Tb = pg.packetBuffer.f(-711444088);
				class_dg.W = pg.packetBuffer.readUnsignedByteS(-8544);
				class_dg.nb = pg.packetBuffer.readUByteC((byte) -127);
				class_dg.Hb = pg.packetBuffer.f(-711444088);
				class_dg.eb = pg.packetBuffer.readUnsignedShortA((byte) 73) + bi.f;
				class_dg.Qb = pg.packetBuffer.readShort(97) - -bi.f;
				class_dg.ib = pg.packetBuffer.readUnsignedByte(255);
				class_dg.cc = 0;
				class_dg.T = 1;
			}
			
			if ((4 & mask) != 0) {
				System.err.println("Mask 10");
				class_dg.Ob = pg.packetBuffer.readUnsignedLEShortA((byte) 110);
				class_dg.anInt_lb = pg.packetBuffer.readShort(70);
			}
			
			if (!var3) {
				a(-50);
			}
		} catch (RuntimeException var13) {
			throw bc.a(var13, "mg.D(" + mask + ',' + (class_dg != null ? "{...}" : "null") + ',' + index + ',' + var3 + ')');
		}
	}
	
	static void a(pe cacheFile8, byte unused, pe cacheFile6, pe cacheFile10) {
		try {
			++e;
			rf.titleJPGValue = cacheFile10.a((byte) -115, fi.titleJPG);
			sh.logoValue = cacheFile8.a((byte) -122, be.logo);
			fc.titleboxValue = cacheFile8.a((byte) -127, ja.titlebox);
			eb.titlebuttonValue = cacheFile8.a((byte) -120, ci.titlebutton);
			r.runesValue = cacheFile8.a((byte) -117, rd.runes);
			ug.title_muteValue = cacheFile8.a((byte) -117, md.title_mute);
			fc.sl_backValue = cacheFile8.a((byte) -125, rf.sl_back);
			oc.sl_flagsValue = cacheFile8.a((byte) -117, lg.sl_flags);
			wa.sl_arrowsValue = cacheFile8.a((byte) -128, ae.sl_arrows);
			mi.sl_starsValue = cacheFile8.a((byte) -124, jf.sl_stars);
			mi.sl_buttonValue = cacheFile8.a((byte) -121, wh.sl_button);
			fc.scapeMainValue = cacheFile6.a((byte) -115, ra.scapeMain);
		} catch (RuntimeException e) {
			throw bc.a(e, "mg.B(" + (cacheFile8 != null ? "{...}" : "null") + ',' + unused + ',' + (cacheFile6 != null ? "{...}" : "null") + ',' + (cacheFile10 != null ? "{...}" : "null") + ')');
		}
	}
	
	public static void a(int var0) {
		try {
			l = null;
			n = null;
			if (var0 != 64) {
				loadingInterfaces2 = null;
			}
			
			b = null;
			d = null;
			c = null;
			a = null;
			loadingInterfaces = null;
			h = null;
			loadingInterfaces2 = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "mg.C(" + var0 + ')');
		}
	}
	
	static {
		loadingInterfaces2 = loadingInterfaces;
		l = rf.a(40, "Type");
		d = l;
		a = new n();
		n = rf.a(40, "Bitte geben Sie Ihren Benutzernamen ein)3");
	}
}
