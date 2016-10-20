final class la extends vd {
	
	static int[] o;
	static ob p = rf.a(40, "Wir vermuten)1 dass jemand Ihr Passwort kennt)3");
	int q;
	static ob clickToSwitch2;
	static int anInt_s;
	static ob t = rf.a(40, "Lade Konfiguration )2 ");
	private static ob clickToSwitch = rf.a(40, "Click to switch");
	static int[][][] v;
	static int w;
	static short[][] x;
	static boolean y;
	static int[][] z;
	static int A;
	static int[] B;
	
	public static void d(int var0) {
		try {
			z = null;
			if (var0 != -2) {
				a(112, 17, -25, -71, -47);
			}
			
			o = null;
			clickToSwitch2 = null;
			clickToSwitch = null;
			x = null;
			v = null;
			p = null;
			B = null;
			t = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "la.B(" + var0 + ')');
		}
	}
	
	public la() {
	}
	
	la(int var1) {
		try {
			this.q = var1;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "la.<init>(" + var1 + ')');
		}
	}
	
	static m a(byte var0, og var1) {
		try {
			++anInt_s;
			if (var0 <= 16) {
				a(-14, -57, 18, -90, -83);
			}
			
			return new m(var1.readSignedShort((byte) -67), var1.readSignedShort((byte) -67), var1.readSignedShort((byte) -67), var1.readSignedShort((byte) -67), var1.readUnsignedMedInt(101), var1.readUnsignedMedInt(-127), var1.readUnsignedByte(255));
		} catch (RuntimeException var3) {
			throw bc.a(var3, "la.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
		try {
			w += 1;
			if ((ch.cb == 0) && (!g.O)) {
				g.W += 1;
				ge.a(lb.T, vb.walkHere2, 0, (short) 43, 0L, paramInt5 + -paramInt3, paramInt2 + -paramInt4);
			}
			long l1 = -1L;
			int i = 0;
			while ((~ni.U) < (~i)) {
				long l2 = nc.longs_g[i];
				int j = (int) l2 & 0x7F;
				int k = ((int) l2 & 0x3FE2) >> 7;
				int m = ((int) l2 & 0x78CFB2C7) >> 29;
				int n = (int) (l2 >>> 32) & 0x7FFFFFFF;
				if (l2 != l1) {
					l1 = l2;
					fc localObject1;
					if ((m == 2) && (kg.a(gf.G, j, k, l2))) {
						localObject1 = rf.b(51438, n);
						if (localObject1.J != null) {
							localObject1 = localObject1.e((byte) -3);
						}
						if (localObject1 == null) {
							break;
						}
						if ((~ch.cb) == -2) {
							jh.i += 1;
							ge.a(wc.a(new ob[] {s.R, aa.H, localObject1.M}, paramInt1 ^ 0xD2E7), fh.h, 0, (short) 47, l2, j, k);
						} else if (g.O) {
							if ((~0x4 & lb.ub) == -5) {
								vd.anInt_a += 1;
								ge.a(wc.a(new ob[] {sf.g, aa.H, localObject1.M}, -3), ac.s, 0, (short) 5, l2, j, k);
							}
						} else {
							ri.l += 1;
							ob[] arrayOfob = localObject1.wb;
							if (hb.x) {
								arrayOfob = tf.a(true, arrayOfob);
							}
							if (arrayOfob != null) {
								int i2 = 4;
								while (i2 >= 0) {
									if (arrayOfob[i2] != null) {
										short s1 = 0;
										if (i2 == 0) {
											s1 = 51;
										}
										if (i2 == 1) {
											s1 = 17;
										}
										if (i2 == 2) {
											s1 = 23;
										}
										if ((~i2) == -4) {
											s1 = 46;
										}
										if (i2 == 4) {
											s1 = 1007;
										}
										ge.a(wc.a(new ob[] {hg.h, localObject1.M}, -3), arrayOfob[i2], 0, s1, l2, j, k);
										oe.anInt_l += 1;
									}
									i2--;
								}
							}
							ge.a(wc.a(new ob[] {hg.h, localObject1.M}, -3), jg.c, 0, (short) 1004, localObject1.N, j, k);
						}
					}
					int i1;
					Object localObject2;
					if ((~m) == -2) {
						nb localObject3 = ai.M[n];
						if ((localObject3.pc.tb == 1) && ((localObject3.coordX & 0x7F) == 64) && ((~0x7F & localObject3.coordY) == -65)) {
							i1 = 0;
							while ((~i1) > (~tf.n)) {
								nb localnb1 = ai.M[ud.Xb[i1]];
								if ((localnb1 != null) && (localnb1 != localObject3) && (localnb1.pc.tb == 1) && (localObject3.coordX == localnb1.coordX) && ((~localnb1.coordY) == (~localObject3.coordY))) {
									b.a(j, -2, ud.Xb[i1], localnb1.pc, k);
								}
								i1++;
							}
							int i3 = 0;
							while ((~se.b) < (~i3)) {
								localObject2 = lg.j[si.cb[i3]];
								if ((localObject2 != null) && ((~localObject3.coordX) == (~((ud) localObject2).coordX)) && (localObject3.coordY == ((ud) localObject2).coordY)) {
									rg.a(k, -126, j, (dg) localObject2, si.cb[i3]);
								}
								i3++;
							}
						}
						b.a(j, -2, n, localObject3.pc, k);
					}
					if (m == 0) {
						dg localObject3 = lg.j[n];
						if (((~localObject3.coordX & 0x7F) == -65) && ((localObject3.coordY & 0x7F) == 64)) {
							i1 = 0;
							while ((~i1) > (~tf.n)) {
								nb localnb2 = ai.M[ud.Xb[i1]];
								if ((localnb2 != null) && (localnb2.pc.tb == 1) && ((~localnb2.coordX) == (~localObject3.coordX)) && ((~localObject3.coordY) == (~localnb2.coordY))) {
									b.a(j, -2, ud.Xb[i1], localnb2.pc, k);
								}
								i1++;
							}
							int i4 = 0;
							while ((~se.b) < (~i4)) {
								localObject2 = lg.j[si.cb[i4]];
								if ((localObject2 != null) && (localObject3 != localObject2) && ((~localObject3.coordX) == (~((ud) localObject2).coordX)) && (localObject3.coordY == ((ud) localObject2).coordY)) {
									rg.a(k, -105, j, (dg) localObject2, si.cb[i4]);
								}
								i4++;
							}
						}
						rg.a(k, 37, j, localObject3, n);
					}
					if ((~m) == -4) {
						pi localObject3 = hf.C[gf.G][j][k];
						if (localObject3 != null) {
							ta localta = (ta) localObject3.d(50);
							while (localta != null) {
								ei localei = jg.a((byte) -61, localta.P);
								if (ch.cb == 1) {
									jb.db += 1;
									ge.a(wc.a(new ob[] {s.R, vf.w, localei.name}, -3), fh.h, 0, (short) 38, localta.P, j, k);
									
								} else if (!g.O) {
									ob[] objects = localei.groundOption;
									mf.Z += 1;
									if (hb.x) {
										objects = tf.a(true, objects);
									}
									int i5 = 4;
									while ((~i5) <= -1) {
										if ((objects != null) && (objects[i5] != null)) {
											ub.a += 1;
											short s2 = 0;
											if ((~i5) == -1) {
												s2 = 13;
											}
											if ((~i5) == -2) {
												s2 = 48;
											}
											if ((~i5) == -3) {
												s2 = 34;
											}
											if ((~i5) == -4) {
												s2 = 57;
											}
											if (i5 == 4) {
												s2 = 45;
											}
											ge.a(wc.a(new ob[] {le.cb, localei.name}, -3), objects[i5], paramInt1 ^ 0x2D1A, s2, localta.P, j, k);
											
										} else if ((~i5) == -3) {
											tg.h += 1;
											ge.a(wc.a(new ob[] {le.cb, localei.name}, -3), fi.take2, 0, (short) 34, localta.P, j, k);
										}
										i5--;
									}
									ge.a(wc.a(new ob[] {le.cb, localei.name}, paramInt1 + 53987), jg.c, paramInt1 + 53990, (short) 1005, localta.P, j, k);
									
								} else if ((lb.ub & 0x1) == 1) {
									gf.t += 1;
									ge.a(wc.a(new ob[] {sf.g, vf.w, localei.name}, paramInt1 + 53987), ac.s, paramInt1 ^ 0x2D1A, (short) 26, localta.P, j, k);
								}
								localta = (ta) localObject3.e(43712);
							}
						}
					}
				}
				i++;
			}
			if (paramInt1 != 11546) {
				z = null;
			}
		} catch (RuntimeException localRuntimeException) {
			throw bc.a(localRuntimeException, "la.A(" + paramInt1 + ',' + paramInt2 + ',' + paramInt3 + ',' + paramInt4 + ',' + paramInt5 + ')');
		}
		
	}
	
	static {
		clickToSwitch2 = clickToSwitch;
		o = new int[4096];
		
		for (int var0 = 0; var0 < 4096; ++var0) {
			o[var0] = li.a(var0, -56441588);
		}
		
		y = false;
		A = -1;
		B = new int[32];
	}
}
