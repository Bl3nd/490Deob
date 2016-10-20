final class a {
	
	static int a = 0;
	static int b;
	static ob c = rf.a(40, "(U");
	static boolean[][][][] d;
	private static ob starting3DLibrary = rf.a(40, "Starting 3d library");
	private static ob loadingWordpack = rf.a(40, "Loading wordpack )2 ");
	static int g;
	static ob h = rf.a(40, "blaugr-Un:");
	static ja[] i = new ja[23];
	private static ob buttonNearTheTopOfThatPage;
	static int k;
	static int l;
	static ob loadingWordpack2;
	static ob starting3DLibrary2;
	static int o;
	static ob buttonNearTheTopOfThatPage2;
	static int q;
	
	static void a(int i, int i1, int i2, int i3, int i4, int unused) {
		int dummy = client.anInt_wb;
		
		try {
			++l;
			long l = wg.d(i3, i2, i4);
			int i5;
			int i6;
			int i7;
			int i8;
			int i9;
			if (l != 0L) {
				label152:
				{
					i5 = ((int) l & 3828591) >> 20;
					i7 = i;
					i6 = ((int) l & 521982) >> 14;
					if (~l < -1L) {
						i7 = i1;
					}
					
					i8 = 24624 - (-(i2 * 4) - 2048 * (-i4 + 103));
					int[] ints = ki.h.pixels;
					i9 = Integer.MAX_VALUE & (int) (l >>> 32);
					fc fc = rf.b(-14098, i9);
					if (~fc.F != 0) {
						fa fa = fi.g[fc.F];
						if (fa == null) {
							break label152;
						}
						
						int i10 = (fc.Mb * 4 + -fa.Q) / 2;
						int i11 = (-fa.N + 4 * fc.Gb) / 2;
						fa.b(i2 * 4 + (48 - -i10), i11 + 48 + (-fc.Gb + (104 - i4)) * 4);
					}
					
					if (i6 == 0 || i6 == 2) {
						label151:
						{
							if (i5 == 0) {
								ints[i8] = i7;
								ints[i8 + 512] = i7;
								ints[1024 + i8] = i7;
								ints[i8 + 1536] = i7;
							} else if (i5 != 1) {
								if (i5 == 3) {
									ints[i8 - -3] = i7;
									ints[515 + i8] = i7;
									ints[3 + i8 + 1024] = i7;
									ints[1536 + (i8 - -3)] = i7;
								}
								
								if (i5 != 3) {
									break label151;
								}
								
								ints[1536 + i8] = i7;
								ints[1 + 1536 + i8] = i7;
								ints[2 + 1536 + i8] = i7;
								ints[3 + 1536 + i8] = i7;
							}
							
							ints[i8] = i7;
							ints[i8 + 1] = i7;
							ints[i8 - -2] = i7;
							ints[i8 + 3] = i7;
						}
					} else if (i6 == 3) {
						label149:
						{
							if (i5 != 0) {
								if (i5 != 1) {
									if (i5 == 2) {
										ints[3 + i8 - -1536] = i7;
									}
									
									if (i5 != 3) {
										break label149;
									}
									
									ints[i8 + 1536] = i7;
								}
								
								ints[3 + i8] = i7;
							}
							
							ints[i8] = i7;
						}
					}
					
					if (i6 == 2) {
						label147:
						{
							if (i5 == 3) {
								ints[i8] = i7;
								ints[512 + i8] = i7;
								ints[1024 + i8] = i7;
								ints[1536 + i8] = i7;
							} else if (i5 == 0) {
								ints[i8] = i7;
								ints[1 + i8] = i7;
								ints[i8 + 2] = i7;
								ints[3 + i8] = i7;
							} else if (i5 != 1) {
								if (i5 != 2) {
									break label147;
								}
								
								ints[1536 + i8] = i7;
								ints[1537 + i8] = i7;
								ints[1538 + i8] = i7;
								ints[1539 + i8] = i7;
							}
							
							ints[3 + i8] = i7;
							ints[512 + 3 + i8] = i7;
							ints[3 + i8 + 1024] = i7;
							ints[i8 + 1539] = i7;
						}
					}
				}
			}
			
			l = di.a(i3, i2, i4);
			if (~l != -1L) {
				label80:
				{
					i5 = (int) l >> 20 & 3;
					i6 = (511719 & (int) l) >> 14;
					i7 = Integer.MAX_VALUE & (int) (l >>> 32);
					fc fc = rf.b(-14098, i7);
					int i10;
					if (fc.F != -1) {
						fa fa = fi.g[fc.F];
						if (fa == null) {
							break label80;
						}
						
						i9 = (-fa.Q + 4 * fc.Mb) / 2;
						i10 = (4 * fc.Gb + -fa.N) / 2;
						fa.b(i9 + 48 + i2 * 4, 48 - -((-fc.Gb + -i4 + 104) * 4) - -i10);
					}
					
					if (i6 == 9) {
						int[] ints = ki.h.pixels;
						i10 = 4 * i2 + 24624 + ('츀' + -(i4 * 512)) * 4;
						i8 = 15658734;
						if (~l < -1L) {
							i8 = 15597568;
						}
						
						if (i5 != 0 && i5 != 2) {
							ints[i10] = i8;
							ints[1 + 512 + i10] = i8;
							ints[1024 + i10 - -2] = i8;
							ints[3 + (i10 - -1536)] = i8;
						}
						
						ints[i10 + 1536] = i8;
						ints[1025 + i10] = i8;
						ints[512 + i10 - -2] = i8;
						ints[3 + i10] = i8;
					}
				}
			}
			
			l = rh.a(i3, i2, i4);
			if (l != 0L) {
				i5 = Integer.MAX_VALUE & (int) (l >>> 32);
				fc fc = rf.b(-14098, i5);
				if (fc.F != -1) {
					fa fa = fi.g[fc.F];
					if (fa != null) {
						int i10 = (-fa.Q + 4 * fc.Mb) / 2;
						i8 = (fc.Gb * 4 - fa.N) / 2;
						fa.b(4 * i2 + 48 + i10, i8 + (-fc.Gb + -i4 + 104) * 4 + 48);
					}
				}
			}
		} catch (RuntimeException var19) {
			throw bc.a(var19, "a.D(" + i + ',' + i1 + ',' + i2 + ',' + i3 + ',' + i4 + ',' + unused + ')');
		}
	}
	
	static synchronized long a(byte unused) {
		try {
			++o;
			long timeMillis = System.currentTimeMillis();
			if (timeMillis < rh.aLong_q) {
				gh.pb += rh.aLong_q + -timeMillis;
			}
			
			rh.aLong_q = timeMillis;
			return timeMillis + gh.pb;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "a.E(" + unused + ')');
		}
	}
	
	static void a(int i, int unused, int i1) {
		try {
			++q;
			int[] ints = new int[4];
			ints[0] = i;
			int[] ints1 = new int[4];
			int i2 = 1;
			ints1[0] = i1;
			int i3 = 0;
			do {
				if (~ef.gb[i3] != ~i) {
					ints[i2] = ef.gb[i3];
					ints1[i2] = cc.D[i3];
					++i2;
				}
				
				++i3;
			} while (i3 < 4);
			
			ef.gb = ints;
			cc.D = ints1;
			ca.a(ea.ab, cc.D, 0, ef.gb, 25097, -1 + ea.ab.length);
		} catch (RuntimeException var8) {
			throw bc.a(var8, "a.B(" + i + ',' + unused + ',' + i1 + ')');
		}
	}
	
	static void a(int paramInt1, int paramInt2, ra paramra, int paramInt3, int paramInt4) {
		int i19 = client.anInt_wb;
		try {
			li.c(-5);
			oi.b(paramInt4, paramInt3, paramra.L + paramInt4, paramInt3 - -paramra.w);
			if (paramInt1 != 4) {
				a((byte) -114);
			}
			b += 1;
			if ((se.e != 2) && ((~se.e) != -6)) {
				int i2 = 48 + (le.T.coordX / 32);
				int i1 = 0x7FF & jg.h + ve.anInt_l;
				int i3 = 464 + -(le.T.coordY / 32);
				ki.h.a(paramInt4, paramInt3, paramra.L, paramra.w, i2, i3, i1, lg.d + 256, paramra.Hb, paramra.Wb);
				int i4 = 0;
				while (ii.z > i4) {
					int i5 = -(le.T.coordX / 32) + (2 + 4 * jc.bb[i4]);
					int i6 = wc.F[i4] * 4 - (-2 + le.T.coordY / 32);
					ac.a(jh.a[i4], -95, paramInt4, i6, paramra, paramInt3, i5);
					i4++;
				}
				int i5 = 0;
				Object localObject1;
				while ((~i5) > -105) {
					int i6 = 0;
					while (i6 < 104) {
						localObject1 = hf.C[gf.G][i5][i6];
						if (localObject1 != null) {
							int i9 = -(le.T.coordY / 32) + 4 * i6 - -2;
							int i8 = i5 * 4 + (2 - le.T.coordX / 32);
							ac.a(ac.n[0], -113, paramInt4, i9, paramra, paramInt3, i8);
						}
						i6++;
					}
					i5++;
				}
				int i6 = 0;
				int i10;
				while (i6 < tf.n) {
					localObject1 = ai.M[ud.Xb[i6]];
					if ((localObject1 != null) && (((nb) localObject1).b((byte) 99))) {
						Object localObject2 = ((nb) localObject1).pc;
						if ((localObject2 != null) && (((ai) localObject2).lb != null)) {
							localObject2 = ((ai) localObject2).b((byte) 122);
						}
						if ((localObject2 != null) && (((ai) localObject2).hb) && (((ai) localObject2).Q)) {
							int i9 = ((ud) localObject1).coordX / 32 - le.T.coordX / 32;
							i10 = ((ud) localObject1).coordY / 32 - le.T.coordY / 32;
							ac.a(ac.n[1], -86, paramInt4, i10, paramra, paramInt3, i9);
						}
					}
					i6++;
				}
				int i7 = 0;
				while ((~i7) > (~se.b)) {
					dg class_dg = lg.j[si.cb[i7]];
					if ((class_dg != null) && (class_dg.b((byte) 122))) {
						i10 = class_dg.coordY / 32 - le.T.coordY / 32;
						int i12 = 0;
						int i9 = class_dg.coordX / 32 + -(le.T.coordX / 32);
						long l1 = class_dg.Ic.e(19790);
						int i17 = 0;
						while ((~ii.o) < (~i17)) {
							if (((~nb.hc[i17]) == (~l1)) && (kd.W[i17] != 0)) {
								i12 = 1;
								if (i19 == 0) {
									break;
								}
							}
							i17++;
						}
						int i18 = 0;
						if ((le.T.Kc != 0) && (class_dg.Kc != 0) && ((~class_dg.Kc) == (~le.T.Kc))) {
							i18 = 1;
						}
						if (i12 != 0) {
							ac.a(ac.n[3], paramInt1 ^ 0xFFFFFFA3, paramInt4, i10, paramra, paramInt3, i9);
						} else if (i18 != 0) {
							ac.a(ac.n[4], -103, paramInt4, i10, paramra, paramInt3, i9);
						} else {
							ac.a(ac.n[2], -83, paramInt4, i10, paramra, paramInt3, i9);
						}
					}
					i7++;
				}
				ki[] kis = ua.kis_a;
				int i9 = 0;
				while ((~kis.length) < (~i9)) {
					ki class_ki = kis[i9];
					if ((class_ki != null) && ((~class_ki.f) != -1) && ((~bi.f % 20) > -11)) {
						int i15;
						int i16;
						if ((class_ki.f == 1) && ((~class_ki.c) <= -1) && (class_ki.c < ai.M.length)) {
							nb localnb = ai.M[class_ki.c];
							if (localnb != null) {
								i15 = -(le.T.coordX / 32) + localnb.coordX / 32;
								i16 = localnb.coordY / 32 + -(le.T.coordY / 32);
								dh.a(false, paramInt4, class_ki.k, i15, paramInt3, i16, paramra);
							}
						}
						if (class_ki.f == 2) {
							int i13 = -(le.T.coordX / 32) + ((-ic.entityXPosition + class_ki.g) * 4 - -2);
							i15 = (-ic.entityYPosition + class_ki.e) * 4 - -2 + -(le.T.coordY / 32);
							dh.a(false, paramInt4, class_ki.k, i13, paramInt3, i15, paramra);
						}
						if (((~class_ki.f) == -11) && ((~class_ki.c) <= -1) && (lg.j.length > class_ki.c)) {
							dg localdg = lg.j[class_ki.c];
							if (localdg != null) {
								i16 = localdg.coordY / 32 + -(le.T.coordY / 32);
								i15 = localdg.coordX / 32 - le.T.coordX / 32;
								dh.a(false, paramInt4, class_ki.k, i15, paramInt3, i16, paramra);
							}
						}
					}
					i9++;
				}
				if (wg.db != 0) {
					int i11 = 2 + wg.db * 4 + -(le.T.coordX / 32);
					int i14 = -(le.T.coordY / 32) + (wd.q * 4 + 2);
					ac.a(re.v, -113, paramInt4, i14, paramra, paramInt3, i11);
				}
				oi.d(-1 + paramra.L / 2 + paramInt4, -1 + (paramra.w / 2 + paramInt3), 3, 3, 16777215);
			} else {
				oi.a(paramInt4, paramInt3, 0, paramra.Hb, paramra.Wb);
			}
			wf.f[paramInt2] = true;
		} catch (RuntimeException localRuntimeException) {
			throw bc.a(localRuntimeException, "a.F(" + paramInt1 + ',' + paramInt2 + ',' + (paramra != null ? "{...}" : "null") + ',' + paramInt3 + ',' + paramInt4 + ')');
		}
		
	}
	
	static void a(aa aa, int i, int i1, int i2, int i3, int i4) {
		boolean flag = true;
		int i5 = i1;
		int i6 = i1 + i3;
		int i7 = i2 - 1;
		int i8 = i2 + i4;
		for (int i9 = i; i9 <= i + 1; ++i9) {
			if (i9 != ki.s) {
				for (int i10 = i5; i10 <= i6; ++i10) {
					if (i10 >= 0 && i10 < qd.L) {
						for (int i11 = i7; i11 <= i8; ++i11) {
							if (i11 >= 0 && i11 < wc.J && (!flag || i10 >= i6 || i11 >= i8 || i11 < i2 && i10 != i1)) {
								pd pd = nb.oc[i9][i10][i11];
								if (pd != null) {
									int i12 = (la.v[i9][i10][i11] + la.v[i9][i10 + 1][i11] + la.v[i9][i10][i11 + 1] + la.v[i9][i10 + 1][i11 + 1]) / 4 - (la.v[i][i1][i2] + la.v[i][i1 + 1][i2] + la.v[i][i1][i2 + 1] + la.v[i][i1 + 1][i2 + 1]) / 4;
									rc rc = pd.x;
									if (rc != null) {
										if (rc.k.a()) {
											aa.a(rc.k, (i10 - i1) * 128 + (1 - i3) * 64, i12, (i11 - i2) * 128 + (1 - i4) * 64, flag);
										}
										
										if (rc.b != null && rc.b.a()) {
											aa.a(rc.b, (i10 - i1) * 128 + (1 - i3) * 64, i12, (i11 - i2) * 128 + (1 - i4) * 64, flag);
										}
									}
									
									for (int i13 = 0; i13 < pd.B; ++i13) {
										ah ah = pd.D[i13];
										if (ah != null && ah.h.a()) {
											int i14 = ah.e - ah.q + 1;
											int i15 = ah.r - ah.d + 1;
											aa.a(ah.h, (ah.q - i1) * 128 + (i14 - i3) * 64, i12, (ah.d - i2) * 128 + (i15 - i4) * 64, flag);
										}
									}
								}
							}
						}
					}
				}
				--i5;
				flag = false;
			}
		}
	}
	
	static void a(ah ah) {
		for (int i = ah.q; i <= ah.e; ++i) {
			for (int i1 = ah.d; i1 <= ah.r; ++i1) {
				pd pd = nb.oc[ah.k][i][i1];
				if (pd != null) {
					int i2;
					for (int i3 = 0; i3 < pd.B; ++i3) {
						if (pd.D[i3] == ah) {
							--pd.B;
							
							for (i2 = i3; i2 < pd.B; ++i2) {
								pd.D[i2] = pd.D[i2 + 1];
								pd.y[i2] = pd.y[i2 + 1];
							}
							
							pd.D[pd.B] = null;
							break;
						}
					}
					
					pd.I = 0;
					
					for (i2 = 0; i2 < pd.B; ++i2) {
						pd.I |= pd.y[i2];
					}
				}
			}
		}
	}
	
	static void a(int i, int i1, int unused, int i2, int i3) {
		int dummy = client.anInt_wb;//TODO:
		
		try {
			++g;
			sa.a(i3 + i, (byte) 52, i + -i3, i1, e.ints_b[i2]);
			int i4 = 0;
			int i5 = -i3;
			int i6 = i3;
			int i7 = -1;
			if (dummy != 0 || i4 < i3) {
				do {
					i7 += 2;
					i5 += i7;
					++i4;
					if (~i5 <= -1) {
						--i6;
						i5 -= i6 << 1;
						int[] ints = e.ints_b[i2 + -i6];
						int i8 = i + i4;
						int[] ints1 = e.ints_b[i6 + i2];
						int i9 = -i4 + i;
						sa.a(i8, (byte) 52, i9, i1, ints1);
						sa.a(i8, (byte) 52, i9, i1, ints);
					}
					
					int i8 = i + i6;
					int i9 = -i6 + i;
					int[] ints = e.ints_b[i2 - -i4];
					int[] ints1 = e.ints_b[-i4 + i2];
					sa.a(i8, (byte) 52, i9, i1, ints);
					sa.a(i8, (byte) 52, i9, i1, ints1);
				} while (i4 < i6);
			}
		} catch (RuntimeException var15) {
			throw bc.a(var15, "a.C(" + i + ',' + i1 + ',' + unused + ',' + i2 + ',' + i3 + ')');
		}
	}
	
	public static void b(byte unused) {
		try {
			starting3DLibrary2 = null;
			buttonNearTheTopOfThatPage2 = null;
			starting3DLibrary = null;
			i = null;
			h = null;
			loadingWordpack = null;
			buttonNearTheTopOfThatPage = null;
			loadingWordpack2 = null;
			d = null;
			c = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "a.A(" + unused + ')');
		}
	}
	
	static {
		starting3DLibrary2 = starting3DLibrary;
		loadingWordpack2 = loadingWordpack;
		buttonNearTheTopOfThatPage = rf.a(40, "button near the top of that page)3");
		k = 0;
		buttonNearTheTopOfThatPage2 = buttonNearTheTopOfThatPage;
	}
}
