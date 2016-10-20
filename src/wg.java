final class wg extends af {
	
	static ob R;
	static int S;
	static int T;
	private static ob loadingTextures = rf.a(40, "Loading textures )2 ");
	static byte[][] V;
	static int W;
	static int X;
	static int Y;
	static int Z;
	static fa[] ab;
	static ob loadingTextures2;
	static ra[][] cb;
	static int db;
	static int eb;
	private static ob fb;
	static int gb;
	static int hb;
	static int ib;
	static ob jb;
	static int kb;
	
	final int[][] b(int var1, byte var2) {
		int var10 = client.anInt_wb;
		
		try {
			int var4 = -72 / ((-42 - var2) / 41);
			++gb;
			int[][] var3 = super.ve_s.a(var1, (byte) 45);
			if (super.ve_s.u) {
				int[] var5 = var3[0];
				int[] var6 = var3[1];
				int[] var7 = var3[2];
				int var8 = 0;
				if (var10 != 0 || lh.eb > var8) {
					do {
						this.a(var1, var8, false);
						int[][] var9 = this.b(re.q, -51, 0);
						var5[var8] = var9[0][nd.k];
						var6[var8] = var9[1][nd.k];
						var7[var8] = var9[2][nd.k];
						++var8;
					} while (lh.eb > var8);
				}
			}
			
			return var3;
		} catch (RuntimeException var11) {
			throw bc.a(var11, "wg.G(" + var1 + ',' + var2 + ')');
		}
	}
	
	public static void b(byte var0) {
		try {
			loadingTextures2 = null;
			R = null;
			cb = null;
			jb = null;
			if (var0 != -90) {
				ab = null;
			}
			
			loadingTextures = null;
			fb = null;
			V = null;
			ab = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "wg.I(" + var0 + ')');
		}
	}
	
	private final void a(int var1, int var2, boolean var3) {
		int var7 = client.anInt_wb;
		
		try {
			++T;
			int var4 = bd.J[var2];
			if (var3) {
				a(-14, (wc) null);
			}
			
			label83:
			{
				int var5 = rh.r[var1];
				float var6 = (float) Math.atan2((double) (-2048 + var4), (double) (var5 + -2048));
				if ((double) var6 < -3.141592653589793D || (double) var6 > -2.356194490192345D) {
					if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
						re.q = var2;
						nd.k = var1;
						if (var7 == 0) {
							break label83;
						}
					}
					
					if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
						nd.k = lh.eb - var1;
						re.q = var2;
						if (var7 == 0) {
							break label83;
						}
					}
					
					if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
						nd.k = var2;
						re.q = fi.q - var1;
						if (var7 == 0) {
							break label83;
						}
					}
					
					if (var6 < 0.0F || (double) var6 > 0.7853981633974483D) {
						if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
							re.q = fi.q - var2;
							nd.k = -var1 + lh.eb;
							if (var7 == 0) {
								break label83;
							}
						}
						
						if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
							nd.k = var1;
							re.q = -var2 + fi.q;
							if (var7 == 0) {
								break label83;
							}
						}
						
						if ((double) var6 < 2.356194490192345D || (double) var6 > 3.141592653589793D) {
							break label83;
						}
						
						nd.k = -var2 + lh.eb;
						re.q = var1;
						if (var7 == 0) {
							break label83;
						}
					}
					
					re.q = -var1 + fi.q;
					nd.k = lh.eb + -var2;
					if (var7 == 0) {
						break label83;
					}
				}
				
				re.q = var1;
				nd.k = var2;
			}
			
			nd.k &= kg.b;
			re.q &= fc.jb;
		} catch (RuntimeException var8) {
			throw bc.a(var8, "wg.H(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	final void a(int var1, int var2, og var3) {
		try {
			++Y;
			if (~var1 == -1) {
				super.u = var3.readUnsignedByte(255) == 1;
			}
			
			int var4 = -115 / ((var2 - 66) / 57);
		} catch (RuntimeException var5) {
			throw bc.a(var5, "wg.B(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	static void a(int paramInt, hi[] paramArrayOfhi) {
		int i33 = client.anInt_wb;
		try {
			int i = 0;
			while ((~i) > -5) {
				j = 0;
				while ((~j) > -105) {
					k = 0;
					while ((~k) > -105) {
						if ((~0x1 & qe.r[i][j][k]) == -2) {
							int m = i;
							if ((qe.r[1][j][k] & 0x2) == 2) {
								m--;
							}
							if ((~m) <= -1) {
								paramArrayOfhi[m].a(k, false, j);
							}
						}
						k++;
					}
					j++;
				}
				i++;
			}
			X += 1;
			ih.x += -2 + (int) (5.0D * Math.random());
			aa.N += (int) (Math.random() * 5.0D) + -2;
			if (aa.N < -16) {
				aa.N = -16;
			}
			if (paramInt != 2210) {
				V = null;
			}
			if (aa.N > 16) {
				aa.N = 16;
			}
			int k = aa.N >> 1;
			int[][] arrayOfInt2 = new int[104][104];
			if ((~ih.x) > 7) {
				ih.x = -8;
			}
			if ((~ih.x) < -9) {
				ih.x = 8;
			}
			int[][] arrayOfInt1 = new int[104][104];
			int j = ih.x >> 2 << 10;
			int n = 0;
			if (i33 != 0) {
			}
			int i6;
			int i7;
			int i8;
			int i9;
			int i10;
			int i11;
			int i16;
			int i17;
			int i13;
			int i15;
			int i18;
			int i19;
			int i20;
			while ((~n) > -5) {
				byte[][] arrayOfByte = ff.nb[n];
				int i4 = (int) Math.sqrt(5100.0D);
				int i2 = 74;
				int i3 = 768;
				int i5 = i4 * i3 >> 8;
				i6 = 1;
				if (i33 != 0) {
				}
				while (i6 < 103) {
					i7 = 1;
					if (i33 != 0) {
					}
					while (i7 < 103) {
						i8 = i2;
						i9 = d.D[n][(i7 - -1)][i6] - d.D[n][(i7 + -1)][i6];
						i10 = d.D[n][i7][(1 + i6)] - d.D[n][i7][(-1 + i6)];
						i11 = (int) Math.sqrt(i9 * i9 + (65536 + i10 * i10));
						int i14 = -65536 / i11;
						int i12 = (i9 << 8) / i11;
						i16 = (i10 << 8) / i11;
						i8 += (i16 * -50 + (-10 * i14 + i12 * -50)) / i5;
						i17 = (arrayOfByte[i7][(i6 + -1)] >> 2) + (arrayOfByte[(1 + i7)][i6] >> 3) + ((arrayOfByte[(i7 - 1)][i6] >> 2) - (-(arrayOfByte[i7][(1 + i6)] >> 3) - (arrayOfByte[i7][i6] >> 1)));
						arrayOfInt2[i7][i6] = (i8 - i17);
						i7++;
					}
					i6++;
				}
				i7 = 0;
				if (i33 != 0) {
				}
				while (i7 < 104) {
					fi.u[i7] = 0;
					ad.S[i7] = 0;
					o.f[i7] = 0;
					v.X[i7] = 0;
					qf.y[i7] = 0;
					i7++;
				}
				i8 = -5;
				if (i33 != 0) {
				}
				while ((~i8) > -105) {
					i9 = 0;
					if (i33 != 0) {
					}
					while ((~i9) > -105) {
						i10 = 5 + i8;
						if ((~i10) > -105) {
							i11 = 0xFF & li.g[n][i10][i9];
							if ((~i11) < -1) {
								bd localbd1 = cd.a(48652, i11 + -1);
								fi.u[i9] += localbd1.M;
								ad.S[i9] += localbd1.S;
								o.f[i9] += localbd1.T;
								v.X[i9] += localbd1.N;
								qf.y[i9] += 1;
							}
						}
						i11 = -5 + i8;
						if (i11 >= 0) {
							i13 = li.g[n][i11][i9] & 0xFF;
							if (i13 > 0) {
								bd localbd2 = cd.a(48652, i13 + -1);
								fi.u[i9] -= localbd2.M;
								ad.S[i9] -= localbd2.S;
								o.f[i9] -= localbd2.T;
								v.X[i9] -= localbd2.N;
								qf.y[i9] -= 1;
							}
						}
						i9++;
					}
					if ((~i8) <= -1) {
						i11 = 0;
						i10 = 0;
						i13 = 0;
						i15 = 0;
						i16 = 0;
						i17 = -5;
						if (i33 != 0) {
						}
						while (i17 < 104) {
							i18 = i17 + 5;
							i19 = i17 + -5;
							if ((~i18) > -105) {
								i10 += fi.u[i18];
								i11 += ad.S[i18];
								i16 += qf.y[i18];
								i15 += v.X[i18];
								i13 += o.f[i18];
							}
							if ((~i19) <= -1) {
								i13 -= o.f[i19];
								i11 -= ad.S[i19];
								i16 -= qf.y[i19];
								i15 -= v.X[i19];
								i10 -= fi.u[i19];
							}
							if ((i17 >= 0) && ((~i16) < -1)) {
								arrayOfInt1[i8][i17] = rg.a(i13 / i16, i11 / i16, i10 * 256 / i15, -66);
							}
							i17++;
						}
					}
					i8++;
				}
				i9 = 1;
				if (i33 != 0) {
				}
				while (i9 < 103) {
					i10 = 1;
					if (i33 != 0) {
					}
					while ((~i10) > -104) {
						if ((!ag.forceSend) || ((0x2 & qe.r[0][i9][i10]) != 0) || (((qe.r[n][i9][i10] & 0x10) == 0) && ((ae.a(i9, n, i10, false) == fc.ob) || (i33 != 0)))) {
							if ((~n) > (~kd.U)) {
								kd.U = n;
							}
							i11 = 0xFF & li.g[n][i9][i10];
							i13 = tb.bytes_m[n][i9][i10] & 0xFF;
							if (((~i11) < -1) || (i13 > 0)) {
								i15 = d.D[n][i9][i10];
								i16 = d.D[n][(1 + i9)][i10];
								i17 = d.D[n][(i9 + 1)][(1 + i10)];
								i18 = d.D[n][i9][(i10 - -1)];
								if (n > 0) {
									i19 = 1;
									if (((~i11) == -1) && ((~rg.C[n][i9][i10]) != -1)) {
										i19 = 0;
									}
									if ((i13 > 0) && (!pb.a(paramInt ^ 0x8D0, -1 + i13).J)) {
										i19 = 0;
									}
									if ((i19 != 0) && (i16 == i15) && (i17 == i15) && ((~i15) == (~i18))) {
										ah.s[n][i9][i10] = ff.b(ah.s[n][i9][i10], 2340);
									}
								}
								if ((~i11) < -1) {
									i19 = arrayOfInt1[i9][i10];
									int i21 = k + (i19 & 0x7F);
									if (i21 >= 0) {
										if ((~i21) < 65408) {
											i21 = 127;
											if (i33 == 0) {
											}
										}
									} else {
										i21 = 0;
									}
									int i22 = i21 + ((0xFC00 & j + i19) - -(0x380 & i19));
									i20 = ec.T[hh.b(i22, 18459, 96)];
									if (i33 == 0) {
									}
								} else {
									i20 = 0;
									i19 = -1;
								}
								int i22 = arrayOfInt2[(i9 + 1)][i10];
								int i21 = arrayOfInt2[i9][i10];
								int i24 = arrayOfInt2[i9][(i10 - -1)];
								int i23 = arrayOfInt2[(i9 - -1)][(i10 - -1)];
								if ((~i13) == -1) {
									qf.a(n, i9, i10, 0, 0, -1, i15, i16, i17, i18, hh.b(i19, paramInt ^ 0x40B9, i21), hh.b(i19, 18459, i22), hh.b(i19, 18459, i23), hh.b(i19, 18459, i24), 0, 0, 0, 0, i20, 0);
								} else {
									int i26 = nc.h[n][i9][i10];
									int i25 = rg.C[n][i9][i10] + 1;
									tc localtc = pb.a(-70, -1 + i13);
									int i27 = localtc.H;
									if (((~i27) <= -1) && (!ec.Z.b(i27, 121))) {
										i27 = -1;
									}
									int i29;
									int i28;
									int i30;
									int i31;
									if (i27 >= 0) {
										i29 = ec.T[ge.b(41, ec.Z.c(i27, 35056), 96)];
										i28 = -1;
									} else if (localtc.G == -1) {
										i28 = -2;
										i29 = 0;
									} else {
										i28 = localtc.G;
										i30 = k + (0x7F & i28);
										if (i30 >= 0) {
											if ((~i30) < 65408) {
												i30 = 127;
											}
										} else {
											i30 = 0;
										}
										i31 = i30 + (i28 & 0x380) + (j + i28 & 0xFC00);
										i29 = ec.T[ge.b(41, i31, 96)];
									}
									if ((~localtc.F) <= -1) {
										i30 = localtc.F;
										i31 = (0x7F & i30) - -k;
										if (i31 >= 0) {
											if ((~i31) < 65408) {
												i31 = 127;
											}
										} else {
											i31 = 0;
										}
										int i32 = i31 + (i30 - -j & 0xFC00) - -(i30 & 0x380);
										i29 = ec.T[ge.b(41, i32, 96)];
									}
									qf.a(n, i9, i10, i25, i26, i27, i15, i16, i17, i18, hh.b(i19, 18459, i21), hh.b(i19, paramInt + 16249, i22), hh.b(i19, 18459, i23), hh.b(i19, 18459, i24), ge.b(paramInt ^ 0x88B, i28, i21), ge.b(41, i28, i22), ge.b(41, i28, i23), ge.b(41, i28, i24), i20, i29);
								}
							}
						}
						i10++;
					}
					i9++;
				}
				i10 = 1;
				while (i10 < 103) {
					i11 = 1;
					while (i11 < 103) {
						lg.a(n, i11, i10, ae.a(i11, n, i10, false));
						i11++;
					}
					i10++;
				}
				li.g[n] = null;
				tb.bytes_m[n] = null;
				rg.C[n] = null;
				nc.h[n] = null;
				ff.nb[n] = null;
				n++;
			}
			ia.d(-50, -10, -50);
			int i1 = 0;
			while (i1 < 104) {
				int i2 = 0;
				while (i2 < 104) {
					if ((~0x2 & qe.r[1][i1][i2]) == -3) {
						qb.b(i1, i2);
					}
					i2++;
				}
				i1++;
			}
			int i2 = 1;
			int i4 = 4;
			int i3 = 2;
			int i5 = 0;
			while (i5 < 4) {
				if ((~i5) < -1) {
					i4 <<= 3;
					i3 <<= 3;
					i2 <<= 3;
				}
				int i12 = 0;
				while (i5 >= i12) {
					int i14 = 0;
					while ((~i14) >= -105) {
						int i21 = 0;
						while ((~i21) >= -105) {
							if ((i2 & ah.s[i12][i21][i14]) != 0) {
								i9 = i14;
								i11 = i12;
								while (((~i9) < -1) && ((i2 & ah.s[i12][i21][(-1 + i9)]) != 0)) {
									i9--;
								}
								i10 = i14;
								i13 = i12;
								do {
									i10++;
									if (i10 >= 104) {
										break;
									}
								} while ((ah.s[i12][i21][(i10 - -1)] & i2) != 0);
								while (i11 > 0) {
									i15 = i9;
									while ((~i10) <= (~i15)) {
										if (((~i2 & ah.s[(i11 - 1)][i21][i15]) == -1) && (i33 == 0)) {
											break;
										}
										i15++;
									}
									i11--;
								}
								while (i13 < i5) {
									i15 = i9;
									while ((~i10) <= (~i15)) {
										if (((ah.s[(i13 + 1)][i21][i15] & i2) == 0) && (i33 == 0)) {
											break;
										}
										i15++;
									}
									i13++;
								}
								i15 = (i10 + (-i9 + 1)) * (-i11 + (i13 + 1));
								if (i15 >= 8) {
									i16 = 240;
									i17 = -i16 + d.D[i13][i21][i9];
									i18 = d.D[i11][i21][i9];
									gh.a(i5, 1, 128 * i21, 128 * i21, i9 * 128, i10 * 128 - 65408, i17, i18);
									i19 = i11;
									while ((~i19) >= (~i13)) {
										i20 = i9;
										while ((~i10) <= (~i20)) {
											ah.s[i19][i21][i20] = bd.b(ah.s[i19][i21][i20], ~i2);
											i20++;
										}
										i19++;
									}
								}
							}
							if ((ah.s[i12][i21][i14] & i3) != 0) {
								i10 = i21;
								i9 = i21;
								do {
									i10++;
									if (i10 >= 104) {
										break;
									}
								} while ((i3 & ah.s[i12][(1 + i10)][i14]) != 0);
								while ((i9 > 0) && ((ah.s[i12][(-1 + i9)][i14] & i3) != 0)) {
									i9--;
								}
								i11 = i12;
								i13 = i12;
								while (i11 > 0) {
									i15 = i9;
									while (i10 >= i15) {
										if (((ah.s[(i11 - 1)][i15][i14] & i3) == 0) && (i33 == 0)) {
											break;
										}
										i15++;
									}
									i11--;
								}
								while (i13 < i5) {
									i15 = i9;
									while ((~i10) <= (~i15)) {
										if ((ah.s[1 + i13][i15][i14] & i3) == 0 && (i33 == 0)) {
											break;
										}
										i15++;
									}
									i13++;
								}
								i15 = (-i11 + i13 - -1) * (i10 - i9 + 1);
								if (i15 >= 8) {
									int i22 = 240;
									i17 = -i22 + d.D[i13][i9][i14];
									i18 = d.D[i11][i9][i14];
									gh.a(i5, 2, i9 * 128, 128 * i10 - 65408, i14 * 128, 128 * i14, i17, i18);
									int i23 = i11;
									while ((~i23) >= (~i13)) {
										i20 = i9;
										while (i20 <= i10) {
											System.out.println(i23 + " " + i20 + " " + i14 + " " + i10);
											ah.s[i23][i20][i14] = bd.b(ah.s[i23][i20][i14], ~i3);
											i20++;
										}
										i23++;
									}
								}
							}
							if ((ah.s[i12][i21][i14] & i4) != 0) {
								i11 = i14;
								i9 = i21;
								while (((~i11) < -1) && ((~ah.s[i12][i21][(-1 + i11)] & i4) != -1)) {
									i11--;
								}
								i10 = i21;
								i13 = i14;
								if (i33 != 0) {
								}
								do {
									i13++;
									if ((~i13) <= -105) {
										break;
									}
								} while ((ah.s[i12][i21][(1 + i13)] & i4) != 0);
								if (i33 != 0) {
								}
								while (i9 > 0) {
									i15 = i11;
									if (i33 != 0) {
									}
									while (i15 <= i13) {
										if (((ah.s[i12][(-1 + i9)][i15] & i4) == 0) && (i33 == 0)) {
											break;
										}
										i15++;
									}
									i9--;
								}
								if (i33 != 0) {
								}
								while (i10 < 104) {
									i15 = i11;
									if (i33 != 0) {
									}
									while ((~i15) >= (~i13)) {
										if (((~ah.s[i12][(i10 - -1)][i15] & i4) == -1) && (i33 == 0)) {
											break;
										}
										i15++;
									}
									i10++;
								}
								if ((~(-i9 + i10 - -1) * (1 + -i11 + i13)) <= -5) {
									i15 = d.D[i12][i9][i11];
									gh.a(i5, 4, 128 * i9, 128 + i10 * 128, i11 * 128, 128 * i13 + 128, i15, i15);
									i16 = i9;
									if (i33 != 0) {
									}
									while ((~i10) <= (~i16)) {
										i17 = i11;
										if (i33 != 0) {
										}
										while ((~i13) <= (~i17)) {
											ah.s[i12][i16][i17] = bd.b(ah.s[i12][i16][i17], ~i4);
											i17++;
										}
										i16++;
									}
								}
							}
							i21++;
						}
						i14++;
					}
					i12++;
				}
				i5++;
			}
			return;
		} catch (RuntimeException localRuntimeException) {
			throw bc.a(localRuntimeException, "wg.J(" + paramInt + ',' + (paramArrayOfhi != null ? "{...}" : "null") + ')');
		}
		
	}
	
	static void i(int var0) {
		try {
			qa.j.b(9946);
			if (var0 > -93) {
				R = null;
			}
			
			++eb;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "wg.C(" + var0 + ')');
		}
	}
	
	static void a(int var0, ra[] var1, int var2) {
		int var6 = client.anInt_wb;
		
		try {
			++Z;
			if (var2 == -15562) {
				int var3 = 0;
				if (var6 != 0 || var1.length > var3) {
					do {
						ra var4 = var1[var3];
						if (var4 != null) {
							if (~var4.Ac == -1) {
								if (var4.xb != null) {
									a(var0, var4.xb, -15562);
								}
								
								re var5 = (re) rd.J.a((long) var4.Ec, 22346);
								if (var5 != null) {
									vg.a(var0, true, var5.w);
								}
							}
							
							wc var8;
							if (var0 == 0 && var4.W != null) {
								var8 = new wc();
								var8.E = var4;
								var8.P = var4.W;
								a(-125, (wc) var8);
							}
							
							if (var0 == 1 && var4.kc != null) {
								label88:
								{
									if (~var4.Rb <= -1) {
										ra var9 = tc.b(var4.Ec, (int) -76);
										if (var9 == null || var9.xb == null || ~var4.Rb <= ~var9.xb.length || var4 != var9.xb[var4.Rb] && var6 == 0) {
											break label88;
										}
									}
									
									var8 = new wc();
									var8.P = var4.kc;
									var8.E = var4;
									a(var2 + 15447, var8);
								}
							}
						}
						
						++var3;
					} while (var1.length > var3);
					
				}
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "wg.A(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}
	
	static void a(int var0, wc var1) {
		try {
			++S;
			if (var0 <= -98) {
				ve.a(var1, 200000, 26186);
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "wg.E(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	public wg() {
		super(1, false);
	}
	
	static long d(int var0, int var1, int var2) {
		pd var3 = nb.oc[var0][var1][var2];
		return var3 != null && var3.x != null ? var3.x.j : 0L;
	}
	
	final int[] a(byte var1, int var2) {
		int var6 = client.anInt_wb;
		
		try {
			++ib;
			if (var1 < 13) {
				a(7, (hi[]) null);
			}
			
			int[] var3 = super.nd_v.a(var2, 12);
			if (super.nd_v.n) {
				int var4 = 0;
				if (var6 != 0 || var4 < lh.eb) {
					do {
						this.a(var2, var4, false);
						int[] var5 = this.c(re.q, 0, 93);
						var3[var4] = var5[nd.k];
						++var4;
					} while (var4 < lh.eb);
				}
			}
			
			return var3;
		} catch (RuntimeException var7) {
			throw bc.a(var7, "wg.F(" + var1 + ',' + var2 + ')');
		}
	}
	
	static {
		loadingTextures2 = loadingTextures;
		db = 0;
		fb = rf.a(40, "Connection timed out)3");
		R = fb;
		jb = rf.a(40, "null");
	}
}
