import java.util.Random;

final class bc extends af {
	
	private int R;
	private int S = 0;
	static int T;
	static ob U = rf.a(40, "oder benutzen Sie eine andere Welt)3");
	static int V;
	private int W = 1024;
	static int X;
	static int Y;
	static boolean Z = false;
	private int ab = 1024;
	static int bb;
	static int cb;
	private int db = 409;
	static int eb;
	static int fb = 0;
	private int gb = 1024;
	private int hb = 1024;
	private int ib = 2048;
	private int jb = 0;
	static int kb;
	static og[] lb = new og[2048];
	static int mb = 255;
	static int nb;
	private int ob = 819;
	
	public bc() {
		super(0, true);
	}
	
	static byte[] b(byte unused, int seed) {
		int dummy = client.anInt_wb;
		
		try {
			qd qd = (qd) ji.D.a((long) seed, (byte) -74);
			++nb;
			if (qd == null) {
				Random random = new Random((long) seed);
				byte[] bytes = new byte[512];
				int i = 0;
				if (~i > -256) {
					do {
						bytes[i] = (byte) i;
						++i;
					} while (~i > -256);
				}
				
				int i1 = 0;
				if (~i1 > -256) {
					do {
						int i2 = 255 - i1;
						int a = v.a((byte) 87, random, i2);
						byte b = bytes[a];
						bytes[a] = bytes[i2];
						bytes[i2] = bytes[511 + -i1] = b;
						++i1;
					} while (~i1 > -256);
				}
				
				qd = new qd(bytes);
				ji.D.a(qd, (byte) -88, (long) seed);
			}
			
			return qd.M;
		} catch (RuntimeException var11) {
			throw a(var11, "bc.A(" + unused + ',' + seed + ')');
		}
	}
	
	final int[] a(byte unused, int i) {
		int dummy = client.anInt_wb;
		
		try {
			int[] ints = super.nd_v.a(i, 12);
			if (unused < 13) {
				V = 83;
			}
			
			++bb;
			if (super.nd_v.n) {
				int[][] ints1 = super.nd_v.a(2);
				int i1 = 0;
				int i2 = 0;
				int i3 = 0;
				int i4 = 0;
				int i5 = 0;
				boolean flag = true;
				int i6 = lh.eb * this.hb >> 12;
				int i7 = 0;
				int i8 = 0;
				int i9 = this.db * fi.q >> 12;
				boolean flag2 = true;
				int i10 = this.ib * lh.eb >> 12;
				int i11 = this.ob * fi.q >> 12;
				if (~i11 >= -2) {
					return ints1[i];
				}
				
				this.R = this.ab * (lh.eb / 8) >> 12;
				int i12 = 1 - -(lh.eb / i6);
				int[][] ints2 = new int[i12][3];
				int[][] ints3 = new int[i12][3];
				Random random = new Random((long) this.S);
				
				do {
					int i13;
					int i14;
					int i15;
					int i16;
					int i17;
					int[] ints4;
					do {
						i14 = i6 + v.a((byte) 122, random, i10 + -i6);
						i15 = v.a((byte) 126, random, -i9 + i11) + i9;
						i16 = i14 + i3;
						if (~i16 < ~lh.eb) {
							i16 = lh.eb;
							i14 = lh.eb + -i3;
						}
						
						{
							if (!flag2) {
								int i18 = i5;
								int i19 = i16 - -i1;
								if (~i19 > -1) {
									i19 += lh.eb;
								}
								
								int[] ints5 = ints3[i5];
								i17 = 0;
								if (~lh.eb > ~i19) {
									i19 -= lh.eb;
								}
								
								i13 = ints5[2];
								
								do {
									int[] ints6 = ints3[i18];
									if (i19 >= ints6[0] && ~ints6[1] <= ~i19) {
										break;
									}
									
									++i18;
									if (~i18 <= ~i8) {
										i18 = 0;
									}
									
									++i17;
								} while (dummy == 0);
								
								if (i5 != i18) {
									int i20 = i1 + i3;
									if (~i20 > -1) {
										i20 += lh.eb;
									}
									
									if (lh.eb < i20) {
										i20 -= lh.eb;
									}
									
									int i21 = 1;
									if (i21 <= i17) {
										do {
											int[] ints6 = ints3[(i21 + i5) % i8];
											i13 = Math.max(i13, ints6[2]);
											++i21;
										} while (i21 <= i17);
									}
									
									int i22 = 0;
									if (i17 >= i22) {
										do {
											int[] ints6 = ints3[(i22 + i5) % i8];
											int i23 = ints6[2];
											if (i23 == i13) {
												++i22;
											} else {
												int i24;
												int i25;
												int i26 = ints6[0];
												int i27 = ints6[1];
												if (i20 >= i19) {
													if (~i26 != -1) {
														i24 = Math.max(i20, i26);
														i25 = lh.eb;
													} else {
														i25 = Math.min(i19, i27);
														i24 = 0;
													}
												} else {
													i24 = Math.max(i20, i26);
													i25 = Math.min(i19, i27);
												}
												this.a(random, i13 - i23, i23, ints1, i4 + i24, (byte) -36, i25 + -i24);
												++i22;
											}
										} while (i17 >= i22);
									}
								}
								
								i5 = i18;
							}
							
							i13 = 0;
						}
						
						if (~fi.q > ~(i15 + i13)) {
							i15 = fi.q - i13;
						}
						
						flag = false;
						
						if (lh.eb == i16) {
							break;
						}
						
						ints4 = ints2[i7++];
						ints4[0] = i3;
						ints4[2] = i13 - -i15;
						ints4[1] = i16;
						this.a(random, i15, i13, ints1, i2 + i3, (byte) -36, i14);
						i3 = i16;
					} while (dummy == 0);
					
					this.a(random, i15, i13, ints1, i3 - -i2, (byte) -36, i14);
					if (flag) {
						break;
					}
					
					i5 = 0;
					flag = true;
					i4 = i2;
					int[][] ints5 = ints3;
					ints4 = ints2[i7++];
					ints4[1] = i16;
					ints3 = ints2;
					ints4[0] = i3;
					ints4[2] = i13 + i15;
					ints2 = ints5;
					flag2 = false;
					i8 = i7;
					i3 = 0;
					i7 = 0;
					i2 = v.a((byte) 114, random, lh.eb);
					i1 = -i4 + i2;
					i17 = i1;
					if (i1 < 0) {
						i17 = i1 + lh.eb;
					}
					
					if (~i17 < ~lh.eb) {
						i17 -= lh.eb;
					}
					
					while (true) {
						int[] ints6 = ints3[i5];
						if (~ints6[0] >= ~i17 && ~ints6[1] <= ~i17) {
							break;
						}
						
						++i5;
						if (i8 <= i5) {
							i5 = 0;
						}
					}
				} while (dummy == 0);
			}
			
			return ints;
		} catch (RuntimeException var40) {
			throw a(var40, "bc.F(" + unused + ',' + i + ')');
		}
	}
	
	final void a(int i, int unused, og og) {
		try {
			++X;
			if (i != 0) {
				if (i == 1) {
					this.hb = og.readShort(118);
					return;
				} else if (i == 2) {
					this.ib = og.readShort(76);
					return;
				} else if (i == 3) {
					this.db = og.readShort(89);
					return;
				} else if (i == 4) {
					this.ob = og.readShort(113);
					return;
				} else if (i == 5) {
					this.ab = og.readShort(39);
					return;
				} else if (i == 6) {
					this.jb = og.readUnsignedByte(255);
					return;
				} else if (i == 7) {
					this.W = og.readShort(60);
					return;
				} else if (i != 8) {
					return;
				}
				
				if (client.anInt_wb == 0) {
					this.gb = og.readShort(67);
					return;
				}
			}
			
			this.S = og.readUnsignedByte(255);
		} catch (RuntimeException var6) {
			throw a(var6, "bc.B(" + i + ',' + unused + ',' + (og != null ? "{...}" : "null") + ')');
		}
	}
	
	public static void b(byte unused) {
		try {
			U = null;
			lb = null;
		} catch (RuntimeException var2) {
			throw a(var2, "bc.C(" + unused + ')');
		}
	}
	
	final void f(int var1) {
		try {
			++T;
			if (var1 != 1) {
				this.ob = -37;
			}
		} catch (RuntimeException var3) {
			throw a(var3, "bc.L(" + var1 + ')');
		}
	}
	
	static se a(Throwable throwable, String s) {
		++kb;
		se se;
		if (throwable instanceof se) {
			se = (se) throwable;
			se.n = se.n + ' ' + s;
		} else {
			se = new se(throwable, s);
		}
		
		return se;
	}
	
	static void a(pe cacheFile7, pe cacheFile18, byte unused) {
		try {
			sh.cacheFile7 = cacheFile7;
			sb.cacheFile18 = cacheFile18;
			++eb;
		} catch (RuntimeException e) {
			throw a(e, "bc.I(" + (cacheFile7 != null ? "{...}" : "null") + ',' + (cacheFile18 != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}
	
	static void i(int unused) {
		try {
			++cb;
			
			try {
				if (uc.jb == 1) {
					int i = ie.u.h(-76);
					if (~i < -1 && ie.u.e(125)) {
						i -= ca.Pb;
						if (i < 0) {
							i = 0;
						}
						
						ie.u.e(-111, i);
					} else {
						ie.u.a((byte) 64);
						ie.u.f(-82);
						dh.m = null;
						if (m.cacheFile6 == null) {
							uc.jb = 0;
						} else {
							uc.jb = 2;
						}
						
						rc.oe_m = null;
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				ie.u.a((byte) 64);
				dh.m = null;
				rc.oe_m = null;
				uc.jb = 0;
				m.cacheFile6 = null;
			}
		} catch (RuntimeException var3) {
			throw a(var3, "bc.E(" + unused + ')');
		}
	}
	
	private void a(Random random, int i10, int i11, int[][] paramArrayOfInt, int i12, byte unused, int i13) {
		try {
			Y += 1;
			int i = this.gb > 0 ? 4096 - v.a((byte) 121, random, this.gb) : 4096;
			int j = this.R * this.W >> 12;
			int k = this.R + -((~j) >= -1 ? 0 : v.a((byte) 87, random, j));
			if (i12 >= lh.eb) {
				i12 -= lh.eb;
			}
			if (k > 0) {
				if ((i10 <= 0) || (i13 <= 0)) {
					return;
				}
				int m = i13 / 2;
				int n = i10 / 2;
				int i1 = (~m) <= (~k) ? k : m;
				int i3 = i1 + i12;
				int i2 = (~k) < (~n) ? n : k;
				int i4 = -(i1 * 2) + i13;
				int i5 = 0;
				while ((~i10) < (~i5)) {
					int[] arrayOfInt2 = paramArrayOfInt[(i11 + i5)];
					int i6;
					int i7;
					int i8;
					if (i5 < i2) {
						i6 = i * i5 / i2;
						if (this.jb != 0) {
							i7 = 0;
							while ((~i7) > (~i1)) {
								i8 = i * i7 / i1;
								arrayOfInt2[bd.b(i12 - -i7, kg.b)] = (arrayOfInt2[bd.b(kg.b, -1 + i13 + (i12 + -i7))] = i8 < i6 ? i8 : i6);
								i7++;
							}
						} else {
							i7 = 0;
							while ((~i1) < (~i7)) {
								i8 = i7 * i / i1;
								arrayOfInt2[bd.b(i7 + i12, kg.b)] = (arrayOfInt2[bd.b(-1 + i12 + (i13 - i7), kg.b)] = i8 * i6 >> 12);
								i7++;
							}
						}
						if (lh.eb < i4 + i3) {
							i7 = -i3 + lh.eb;
							p.a(arrayOfInt2, i3, i7, i6);
							p.a(arrayOfInt2, 0, i4 + -i7, i6);
						} else {
							p.a(arrayOfInt2, i3, i4, i6);
						}
					} else {
						i6 = -i5 + (i10 + -1);
						if (i2 > i6) {
							i7 = i * i6 / i2;
							int i9;
							if ((~this.jb) == -1) {
								i8 = 0;
								while ((~i8) > (~i1)) {
									i9 = i8 * i / i1;
									arrayOfInt2[bd.b(kg.b, i12 + i8)] = (arrayOfInt2[bd.b(kg.b, -1 + (-i8 + (i13 + i12)))] = i7 * i9 >> 12);
									i8++;
								}
							} else {
								i8 = 0;
								while ((~i8) > (~i1)) {
									i9 = i * i8 / i1;
									arrayOfInt2[bd.b(i8 + i12, kg.b)] = (arrayOfInt2[bd.b(i13 + (i12 + (-i8 + -1)), kg.b)] = (~i7) >= (~i9) ? i7 : i9);
									i8++;
								}
							}
							if ((~lh.eb) <= (~i4 + i3)) {
								p.a(arrayOfInt2, i3, i4, i7);
							} else {
								i8 = -i3 + lh.eb;
								p.a(arrayOfInt2, i3, i8, i7);
								p.a(arrayOfInt2, 0, i4 + -i8, i7);
							}
						} else {
							i7 = 0;
							while (i1 > i7) {
								arrayOfInt2[bd.b(i12 + i7, kg.b)] = (arrayOfInt2[bd.b(i13 + (i12 + -i7 - 1), kg.b)] = i7 * i / i1);
								i7++;
							}
							if ((~i4 + i3) >= (~lh.eb)) {
								p.a(arrayOfInt2, i3, i4, i);
							} else {
								i8 = lh.eb - i3;
								p.a(arrayOfInt2, i3, i8, i);
								p.a(arrayOfInt2, 0, -i8 + i4, i);
							}
						}
					}
					i5++;
				}
				return;
			}
			if (lh.eb >= i12 - -i13) {
				int m = 0;
				while (m < i10) {
					p.a(paramArrayOfInt[(m + i11)], i12, i13, i);
					m++;
				}
				return;
			}
			int m = lh.eb + -i12;
			int n = 0;
			while ((~i10) < (~n)) {
				int[] arrayOfInt1 = paramArrayOfInt[(n + i11)];
				p.a(arrayOfInt1, i12, m, i);
				p.a(arrayOfInt1, 0, -m + i13, i);
				n++;
			}
		} catch (RuntimeException localRuntimeException) {
			throw a(localRuntimeException, "bc.H(" + (random != null ? "{...}" : "null") + ',' + i10 + ',' + i11 + ',' + (paramArrayOfInt != null ? "{...}" : "null") + ',' + i12 + ',' + unused + ',' + i13 + ')');
		}
		
	}
}
