import java.awt.Component;
import java.util.Arrays;

final class fi {
	
	static long aLong_a;
	static int b;
	int c;
	static int d;
	int e;
	static int f = 0;
	static fa[] g;
	int h;
	static int i;
	int j;
	int k;
	static volatile int l = 0;
	static ob titleJPG = rf.a(40, "title)3jpg");
	private static ob world;
	int o;
	static ob world2;
	static int q;
	static ob r = rf.a(40, "Bitte laden Sie die Seite neu)3");
	static ob take2;
	static boolean[] t = new boolean[112];
	static int[] u;
	private static ob take = rf.a(40, "Take");
	static ob w;
	byte[] x;
	byte[] y;
	int z;
	
	public static void a(int var0) {
		try {
			w = null;
			g = null;
			t = null;
			if (var0 < 23) {
				a(126);
			}
			
			take2 = null;
			take = null;
			titleJPG = null;
			r = null;
			u = null;
			world2 = null;
			world = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "fi.C(" + var0 + ')');
		}
	}
	
	static void a(byte var0, Component var1) {
		try {
			var1.removeMouseListener(vc.g);
			if (var0 <= 15) {
				world2 = null;
			}
			
			var1.removeMouseMotionListener(vc.g);
			var1.removeFocusListener(vc.g);
			++i;
			l = 0;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "fi.D(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	static void a() {
		for (int var0 = 0; var0 < bf.ab; ++var0) {
			ah var1 = ld.ahs_q[var0];
			a.a(var1);
			ld.ahs_q[var0] = null;
		}
		
		bf.ab = 0;
	}
	
	static void a(boolean paramBoolean, byte paramByte) {
		int i20 = client.anInt_wb;
		try {
			ef.V = paramBoolean;
			b += 1;
			//int i11;
			//int i12;
			if (!ef.V) {
				int localX = pg.packetBuffer.readUnsignedLEShortA((byte) 110);
				int playerRegionY = pg.packetBuffer.readUnsignedLEShortA((byte) 110);
				int height = pg.packetBuffer.readUByteC((byte) -127);
				int localY = pg.packetBuffer.readUnsignedShort((byte) -126);
				int playerRegionX = pg.packetBuffer.readUnsignedShortA(Byte.MAX_VALUE);
				int length = (sh.packetSize - pg.packetBuffer.pointer) / 16;
				la.z = new int[length][4];
				for (int i8 = 0; length > i8; i8++) {
					for (int plane = 0; plane < 4; plane++) {
						la.z[i8][plane] = pg.packetBuffer.readSignedLEShort(-70);
					}
				}
				ic.R = new int[length];
				tf.l = new byte[length][];
				rc.bytes_e = new byte[length][];
				qh.e = new int[length];
				int forceSend = 0;
				if ((playerRegionX / 8 == 48 || playerRegionX / 8 == 49) && playerRegionY / 8 == 48) {
					forceSend = 1;
				}
				bg.ints_g = new int[length];
				if (playerRegionX / 8 == 48 && ~playerRegionY / 8 == 65387) {
					forceSend = 1;
				}
				length = 0;
				int xCalc = (playerRegionX + -6) / 8;
				while ((6 + playerRegionX) / 8 >= xCalc) {
					int yCalc = (-6 + playerRegionY) / 8;
					while (yCalc <= (6 + playerRegionY) / 8) {
						int region = yCalc + (xCalc << 8);
						if (forceSend == 0 || ~yCalc != -50 && yCalc != 149 && yCalc != 147 && xCalc != 50 && (xCalc != 49 || ~yCalc != -48)) {
							bg.ints_g[length] = region;
							ic.R[length] = mf.cacheFile_5.a((byte) -120, wc.a(new ob[] {lh.m_string, hh.a(93, xCalc), pc.underscore, hh.a(93, yCalc)}, -3));
							qh.e[length] = mf.cacheFile_5.a((byte) -125, wc.a(new ob[] {ag.l_string, hh.a(93, xCalc), pc.underscore, hh.a(93, yCalc)}, -3));
							length++;
						}
						yCalc++;
					}
					xCalc++;
				}
				md.a(height, playerRegionY, (byte) -64, localX, localY, playerRegionX);
				return;
			}
			int localX = pg.packetBuffer.readUnsignedShortA((byte) 91);
			int regionY = pg.packetBuffer.readUnsignedShortA((byte) -121);
			pg.packetBuffer.initBITAccess((byte) -65);
			for (int i4 = 0; i4 < 4; i4++) {
				for (int i5 = 0; ~i5 > -14; i5++) {
					for (int i6 = 0; ~i6 > -14; i6++) {
						int i7 = pg.packetBuffer.readBits(1, 11339);
						if (i7 != 1) {
							lg.ints_p[i4][i5][i6] = -1;
						} else {
							lg.ints_p[i4][i5][i6] = pg.packetBuffer.readBits(26, 11339);
						}
					}
				}
			}
			System.out.println(Arrays.deepToString(lg.ints_p));
			pg.packetBuffer.finishBITAccess(8);
			int i5 = (sh.packetSize + -pg.packetBuffer.pointer) / 16;
			la.z = new int[i5][4];
			for (int i6 = 0; i5 > i6; i6++) {
				for (int plane = 0; plane < 4; plane++) {
					la.z[i6][plane] = pg.packetBuffer.readInt(1029109968);
				}
			}
			int localY = pg.packetBuffer.readUnsignedShort((byte) -118);
			int height = pg.packetBuffer.readUnsignedByteS(56992);
			int regionX = pg.packetBuffer.readUnsignedShort((byte) -125);
			qh.e = new int[i5];
			tf.l = new byte[i5][];
			bg.ints_g = new int[i5];
			rc.bytes_e = new byte[i5][];
			ic.R = new int[i5];
			i5 = 0;
			int i10 = 0;
			while ((~i10) > -5) {
				int i11 = 0;
				while (i11 < 13) {
					int i12 = 0;
					while (i12 < 13) {
						int i13 = lg.ints_p[i10][i11][i12];
						if ((~i13) != 0) {
							int i14 = i13 >> 14 & 0x3FF;
							int i15 = (0x3FF9 & i13) >> 3;
							int i16 = i15 / 8 + (i14 / 8 << 8);
							for (int i17 = 0; i17 < i5; i17++) {
								if ((~bg.ints_g[i17]) == (~i16)) {
									i16 = -1;
									if (i20 == 0) {
										break;
									}
								}
							}
							if (i16 != -1) {
								int i18 = i16 >> 8 & 0xFF;
								bg.ints_g[i5] = i16;
								int i19 = 0xFF & i16;
								ic.R[i5] = mf.cacheFile_5.a((byte) -119, wc.a(new ob[] {lh.m_string, hh.a(93, i18), pc.underscore, hh.a(93, i19)}, -3));
								qh.e[i5] = mf.cacheFile_5.a((byte) -120, wc.a(new ob[] {ag.l_string, hh.a(93, i18), pc.underscore, hh.a(93, i19)}, -3));
								i5++;
							}
						}
						i12++;
					}
					i11++;
				}
				i10++;
			}
			md.a(height, regionY, (byte) -71, localX, localY, regionX);
		} catch (RuntimeException localRuntimeException) {
			throw bc.a(localRuntimeException, "fi.B(" + paramBoolean + ',' + paramByte + ')');
		}
		
	}
	
	static {
		take2 = take;
		world = rf.a(40, "World");
		world2 = world;
		w = world;
	}
}
