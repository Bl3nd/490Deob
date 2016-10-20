abstract class af extends vd {
	
	static int anInt_o;
	static int anInt_p;
	static int anInt_q;
	static int anInt_r;
	ve ve_s;
	static int t = 0;
	boolean u;
	nd nd_v;
	static int w;
	static int x;
	static int y;
	private static ob newUser = rf.a(40, "New User");
	static int A;
	static int[] B;
	static int C;
	static vc D;
	static ob newUser2;
	static int F;
	static int G;
	static int H;
	static ob hidden;
	static int J;
	af[] K;
	static int L;
	static int M;
	static ob N;
	static fd O;
	static ae P;
	int Q;
	
	final int[][] b(int i, int unused, int i1) {
		try {
			++A;
			if (this.K[i1].u) {
				int[] ints = this.K[i1].a((byte) 95, i);
				return new int[][] {ints, ints, ints};
			} else {
				return this.K[i1].b(i, (byte) -92);
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "af.IA(" + i + ',' + unused + ',' + i1 + ')');
		}
	}
	
	static void a(int i, int i1, byte unused, int i2, int i3, boolean flag, int i4, int i5, int i6, boolean flag2, hi hi) {
		int dummy = client.anInt_wb;
		
		try {
			++anInt_r;
			if (flag && ~(2 & qe.r[0][i1][i4]) == -1) {
				if (~(16 & qe.r[i3][i1][i4]) != -1) {
					return;
				}
				
				if (ae.a(i1, i3, i4, false) != fc.ob) {
					return;
				}
			}
			
			if (i3 < kd.U) {
				kd.U = i3;
			}
			
			fc fc;
			int i7;
			int i8;
			fc = rf.b(-14098, i2);
			if (~i == -2 || i == 3) {
				i8 = fc.Mb;
				i7 = fc.Gb;
			} else {
				i8 = fc.Gb;
				i7 = fc.Mb;
			}
			
			int i9;
			int i10;
			if (~(i1 - -i7) < -105) {
				i10 = i1 + 1;
				i9 = i1;
			} else {
				i9 = i1 - -(i7 >> 1);
				i10 = (i7 + 1 >> 1) + i1;
			}
			int i11;
			int i12;
			if (i4 + i8 <= 104) {
				i12 = (1 + i8 >> 1) + i4;
				i11 = i4 + (i8 >> 1);
			} else {
				i11 = i4;
				i12 = 1 + i4;
			}
			int[][] ints = d.D[i5];
			int i13 = ints[i10][i11] + ints[i9][i11] - (-ints[i9][i12] - ints[i10][i12]) >> 2;
			int i14 = (i7 << 6) + (i1 << 7);
			int i15 = (i8 << 6) + (i4 << 7);
			long l = (long) (1073741824 | i << 20 | i6 << 14 | i1 | i4 << 7);
			if (fc.kb == 0) {
				l |= Long.MIN_VALUE;
			}
			
			if (fc.K == 1) {
				l |= 4194304L;
			}
			
			l |= (long) i2 << 32;
			if (flag2 && fc.g(-1)) {
				aa.a((byte) 124, i4, i3, fc, i, i1);
			}
			
			Object object;
			qb qb;
			if (i6 == 22) {
				if (!flag || fc.kb != 0 || fc.ub == 1 || fc.Ib) {
					if (~fc.anInt_ib == 0 && fc.J == null) {
						qb = fc.a(i14, 22, flag2, i, i13, 70 + -84, i15, ints);
						assert qb != null;
						object = qb.E;
					} else {
						object = new ff(i2, 22, i, i5, i1, i4, fc.anInt_ib, fc.qb, (aa) null);
					}
					hf.a(i3, i1, i4, i13, (aa) object, l, fc.D);
					if (fc.ub == 1 && hi != null) {
						hi.a((byte) 70, i1, i4);
					}
				}
			} else if (i6 != 10 && ~i6 != -12) {
				if (i6 >= 12) {
					if (fc.anInt_ib == -1 && fc.J == null) {
						qb = fc.a(i14, i6, flag2, i, i13, -65, i15, ints);
						assert qb != null;
						object = qb.E;
					} else {
						object = new ff(i2, i6, i, i5, i1, i4, fc.anInt_ib, fc.qb, null);
					}
					ib.a(i3, i1, i4, i13, 1, 1, (aa) object, 0, l);
					if (flag2 && i6 >= 12 && ~i6 >= -18 && ~i6 != -14 && ~i3 < -1) {
						ah.s[i3][i1][i4] = ff.b(ah.s[i3][i1][i4], 2340);
					}
					
					if (~fc.ub != -1 && hi != null) {
						hi.a(i7, i8, fc.V, i4, i1, (byte) -23);
					}
					
				} else if (i6 == 0) {
					if (~fc.anInt_ib != 0 || fc.J != null) {
						object = new ff(i2, 0, i, i5, i1, i4, fc.anInt_ib, fc.qb, null);
					} else {
						qb = fc.a(i14, 0, flag2, i, i13, -106, i15, ints);
						assert qb != null;
						object = qb.E;
					}
					kf.a(i3, i1, i4, i13, (aa) object, null, ve.t[i], 0, l);
					if (flag2) {
						label553:
						{
							if (i == 0) {
								if (fc.lb) {
									ff.nb[i3][i1][i4] = 50;
									ff.nb[i3][i1][1 + i4] = 50;
								}
								
								if (fc.rb) {
									ah.s[i3][i1][i4] = ff.b(ah.s[i3][i1][i4], 585);
								}
							} else if (i != 1) {
								if (i == 2) {
									if (fc.lb) {
										ff.nb[i3][i1 + 1][i4] = 50;
										ff.nb[i3][i1 - -1][i4 + 1] = 50;
									}
									
									if (fc.rb) {
										ah.s[i3][i1 + 1][i4] = ff.b(ah.s[i3][i1 + 1][i4], 585);
									}
								} else if (i == 3) {
									if (fc.lb) {
										ff.nb[i3][i1][i4] = 50;
										ff.nb[i3][1 + i1][i4] = 50;
									}
									
									if (fc.rb) {
										ah.s[i3][i1][i4] = ff.b(ah.s[i3][i1][i4], 1170);
									}
								}
							}
							
							if (fc.lb) {
								ff.nb[i3][i1][1 + i4] = 50;
								ff.nb[i3][1 + i1][i4 - -1] = 50;
							}
							
							if (fc.rb) {
								ah.s[i3][i1][1 + i4] = ff.b(ah.s[i3][i1][1 + i4], 1170);
							}
						}
					}
					
					if (fc.ub != 0 && hi != null) {
						hi.a(i6, i, fc.V, i1, i4, 70 ^ -70);
					}
					
					if (fc.fb != 16) {
						b.a(i3, i1, i4, fc.fb);
					}
					
				} else if (i6 == 1) {
					if (~fc.anInt_ib != 0 || fc.J != null) {
						object = new ff(i2, 1, i, i5, i1, i4, fc.anInt_ib, fc.qb, null);
					} else {
						qb = fc.a(i14, 1, flag2, i, i13, -78, i15, ints);
						assert qb != null;
						object = qb.E;
					}
					kf.a(i3, i1, i4, i13, (aa) object, null, ld.o[i], 0, l);
					if (fc.lb && flag2) {
						if (i != 0) {
							if (i != 1) {
								if (i == 2) {
									ff.nb[i3][i1 + 1][i4] = 50;
								} else if (i == 3) {
									ff.nb[i3][i1][i4] = 50;
								}
							} else {
								ff.nb[i3][1 + i1][i4 + 1] = 50;
							}
						} else {
							ff.nb[i3][i1][1 + i4] = 50;
						}
					}
					
					if (fc.ub != 0 && hi != null) {
						hi.a(i6, i, fc.V, i1, i4, -4);
					}
					
				} else {
					int i16;
					if (~i6 == -3) {
						Object object2;
						Object object3;
						i16 = 3 & i + 1;
						if (~fc.anInt_ib == 0 && fc.J == null) {
							qb var43 = fc.a(i14, 2, flag2, 4 - -i, i13, 70 + -129, i15, ints);
							assert var43 != null;
							object3 = var43.E;
							var43 = fc.a(i14, 2, flag2, i16, i13, -38, i15, ints);
							assert var43 != null;
							object2 = var43.E;
						} else {
							object3 = new ff(i2, 2, 4 + i, i5, i1, i4, fc.anInt_ib, fc.qb, null);
							object2 = new ff(i2, 2, i16, i5, i1, i4, fc.anInt_ib, fc.qb, null);
						}
						kf.a(i3, i1, i4, i13, (aa) object3, (aa) object2, ve.t[i], ve.t[i16], l);
						if (fc.rb && flag2) {
							if (i != 0) {
								if (i != 1) {
									if (i != 2) {
										if (i == 3) {
											ah.s[i3][i1][i4] = ff.b(ah.s[i3][i1][i4], 1170);
											ah.s[i3][i1][i4] = ff.b(ah.s[i3][i1][i4], 585);
										}
									} else {
										ah.s[i3][1 + i1][i4] = ff.b(ah.s[i3][1 + i1][i4], 585);
										ah.s[i3][i1][i4] = ff.b(ah.s[i3][i1][i4], 1170);
									}
								} else {
									ah.s[i3][i1][i4 + 1] = ff.b(ah.s[i3][i1][i4 + 1], 1170);
									ah.s[i3][1 + i1][i4] = ff.b(ah.s[i3][1 + i1][i4], 585);
								}
							} else {
								ah.s[i3][i1][i4] = ff.b(ah.s[i3][i1][i4], 585);
								ah.s[i3][i1][i4 - -1] = ff.b(ah.s[i3][i1][i4 - -1], 1170);
							}
						}
						
						if (~fc.ub != -1 && hi != null) {
							hi.a(i6, i, fc.V, i1, i4, -4);
						}
						
						if (~fc.fb != -17) {
							b.a(i3, i1, i4, fc.fb);
						}
						
					} else if (~i6 == -4) {
						if (fc.anInt_ib != -1 || fc.J != null) {
							object = new ff(i2, 3, i, i5, i1, i4, fc.anInt_ib, fc.qb, null);
						} else {
							qb = fc.a(i14, 3, flag2, i, i13, -60, i15, ints);
							assert qb != null;
							object = qb.E;
						}
						kf.a(i3, i1, i4, i13, (aa) object, null, ld.o[i], 0, l);
						if (fc.lb && flag2) {
							if (i == 0) {
								ff.nb[i3][i1][i4 + 1] = 50;
							} else if (i != 1) {
								if (i != 2) {
									if (i == 3) {
										ff.nb[i3][i1][i4] = 50;
									}
								} else {
									ff.nb[i3][1 + i1][i4] = 50;
								}
							} else {
								ff.nb[i3][i1 - -1][i4 - -1] = 50;
							}
						}
						
						if (~fc.ub != -1 && hi != null) {
							hi.a(i6, i, fc.V, i1, i4, -4);
						}
						
					} else if (i6 == 9) {
						if (fc.anInt_ib != -1 || fc.J != null) {
							object = new ff(i2, i6, i, i5, i1, i4, fc.anInt_ib, fc.qb, null);
						} else {
							qb = fc.a(i14, i6, flag2, i, i13, -107, i15, ints);
							assert qb != null;
							object = qb.E;
						}
						ib.a(i3, i1, i4, i13, 1, 1, (aa) object, 0, l);
						if (fc.ub != 0 && hi != null) {
							hi.a(i7, i8, fc.V, i4, i1, (byte) -44);
						}
						
						if (fc.fb != 16) {
							b.a(i3, i1, i4, fc.fb);
						}
						
					} else if (i6 == 4) {
						if (fc.anInt_ib == -1 && fc.J == null) {
							qb = fc.a(i14, 4, flag2, i, i13, -53, i15, ints);
							assert qb != null;
							object = qb.E;
						} else {
							object = new ff(i2, 4, i, i5, i1, i4, fc.anInt_ib, fc.qb, null);
						}
						lh.a(i3, i1, i4, i13, (aa) object, null, ve.t[i], 0, 0, 0, l);
					} else {
						long l1;
						Object object2;
						qb qb1;
						if (i6 == 5) {
							i16 = 16;
							l1 = wg.d(i3, i1, i4);
							if (~l1 != -1L) {
								i16 = rf.b(-14098, (int) (l1 >>> 32) & Integer.MAX_VALUE).fb;
							}
							
							if (~fc.anInt_ib == 0 && fc.J == null) {
								qb1 = fc.a(i14, 4, flag2, i, i13, -112, i15, ints);
								assert qb1 != null;
								object2 = qb1.E;
							} else {
								object2 = new ff(i2, 4, i, i5, i1, i4, fc.anInt_ib, fc.qb, null);
							}
							lh.a(i3, i1, i4, i13, (aa) object2, null, ve.t[i], 0, vc.m[i] * i16, vf.z[i] * i16, l);
						} else if (i6 == 6) {
							i16 = 8;
							l1 = wg.d(i3, i1, i4);
							if (l1 != 0L) {
								i16 = rf.b(-14098, Integer.MAX_VALUE & (int) (l1 >>> 32)).fb / 2;
							}
							
							if (fc.anInt_ib != -1 || fc.J != null) {
								object2 = new ff(i2, 4, 4 + i, i5, i1, i4, fc.anInt_ib, fc.qb, null);
							} else {
								qb1 = fc.a(i14, 4, flag2, i + 4, i13, -123, i15, ints);
								assert qb1 != null;
								object2 = qb1.E;
							}
							lh.a(i3, i1, i4, i13, (aa) object2, null, 256, i, i16 * oc.b[i], i16 * sa.e[i], l);
						} else if (i6 == 7) {
							int i17;
							i17 = i + 2 & 3;
							if (~fc.anInt_ib == 0 && fc.J == null) {
								qb qb2 = fc.a(i14, 4, flag2, i17 - -4, i13, -56, i15, ints);
								assert qb2 != null;
								object = qb2.E;
							} else {
								object = new ff(i2, 4, i17 + 4, i5, i1, i4, fc.anInt_ib, fc.qb, null);
							}
							lh.a(i3, i1, i4, i13, (aa) object, null, 256, i17, 0, 0, l);
						} else if (i6 == 8) {
							i16 = 8;
							l1 = wg.d(i3, i1, i4);
							if (l1 != 0L) {
								i16 = rf.b(70 + -14168, Integer.MAX_VALUE & (int) (l1 >>> 32)).fb / 2;
							}
							
							Object object3;
							int i17 = i + 2 & 3;
							if (~fc.anInt_ib != 0 || fc.J != null) {
								object2 = new ff(i2, 4, 4 + i, i5, i1, i4, fc.anInt_ib, fc.qb, null);
								object3 = new ff(i2, 4, i17 + 4, i5, i1, i4, fc.anInt_ib, fc.qb, null);
							} else {
								
								qb qb2 = fc.a(i14, 4, flag2, i + 4, i13, -127, i15, ints);
								assert qb2 != null;
								object2 = qb2.E;
								qb2 = fc.a(i14, 4, flag2, 4 + i17, i13, -20, i15, ints);
								assert qb2 != null;
								object3 = qb2.E;
							}
							lh.a(i3, i1, i4, i13, (aa) object2, (aa) object3, 256, i, oc.b[i] * i16, sa.e[i] * i16, l);
						}
					}
				}
			} else {
				if (~fc.anInt_ib != 0 || fc.J != null) {
					object = new ff(i2, 10, i, i5, i1, i4, fc.anInt_ib, fc.qb, null);
				} else {
					qb = fc.a(i14, 10, flag2, i, i13, -62, i15, ints);
					assert qb != null;
					object = qb.E;
				}
				if (object != null) {
					boolean flag3 = ib.a(i3, i1, i4, i13, i7, i8, (aa) object, ~i6 == -12 ? 256 : 0, l);
					if (fc.lb && flag3 && flag2) {
						int i16 = 15;
						if (object instanceof fe) {
							i16 = ((fe) object).f() / 4;
							if (~i16 < -31) {
								i16 = 30;
							}
						}
						
						int i17 = 0;
						if (/*dummy != 0 || */i17 <= i7) {
							do {
								int var28 = 0;
								if (/*dummy != 0 || */~i8 <= ~var28) {
									do {
										if (~i16 < ~ff.nb[i3][i17 + i1][i4 - -var28]) {
											ff.nb[i3][i17 + i1][var28 + i4] = (byte) i16;
										}
										
										++var28;
									} while (~i8 <= ~var28);
								}
								
								++i17;
							} while (i17 <= i7);
						}
					}
				}
				
				if (fc.ub != 0 && hi != null) {
					hi.a(i7, i8, fc.V, i4, i1, (byte) -108);
				}
			}
		} catch (RuntimeException var32) {
			throw bc.a(var32, "af.HA(" + i + ',' + i1 + ',' + unused + ',' + i2 + ',' + i3 + ',' + flag + ',' + i4 + ',' + i5 + ',' + i6 + ',' + flag2 + ',' + (hi != null ? "{...}" : "null") + ')');
		}
	}
	
	int d(int unused) {
		try {
			++C;
			return -1;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "af.DA(" + unused + ')');
		}
	}
	
	int e(int unused) {
		try {
			++M;
			return -1;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "af.U(" + unused + ')');
		}
	}
	
	static void a(int i, int i1, byte unused, int i2, int i3, int i4) {
		int dummy = client.anInt_wb;
		
		try {
			int i5 = 0;
			++x;
			sa.a(i1 + i4, (byte) 52, i4 + -i1, i3, e.ints_b[i]);
			int i6 = i2;
			int i7 = i2 * i2;
			int i8 = i1 * i1;
			int i9 = i7 << 1;
			int i10 = i8 << 1;
			int i11 = i2 << 1;
			int i12 = i9 + i8 * (1 - i11);
			int i13 = -((i11 + -1) * i10) + i7;
			int i14 = i8 << 2;
			int i15 = i7 << 2;
			int i16 = i9 * (3 + (i5 << 1));
			int i17 = i14 * (i2 - 1);
			int i18 = i10 * ((i2 << 1) + -3);
			int i19 = (1 + i5) * i15;
			if (/*dummy != 0 || */i2 > 0) {
				do {
					if (i12 < 0 && (/*dummy != 0 || */~i12 > -1)) {
						do {
							++i5;
							i12 += i16;
							i13 += i19;
							i19 += i15;
							i16 += i15;
						} while (~i12 > -1);
					}
					
					if (~i13 > -1) {
						i12 += i16;
						++i5;
						i16 += i15;
						i13 += i19;
						i19 += i15;
					}
					
					i13 += -i18;
					i12 += -i17;
					i17 -= i14;
					i18 -= i14;
					--i6;
					int i20 = i4 - -i5;
					int i21 = i - -i6;
					int i22 = -i6 + i;
					int i23 = i4 - i5;
					sa.a(i20, (byte) 52, i23, i3, e.ints_b[i22]);
					sa.a(i20, (byte) 52, i23, i3, e.ints_b[i21]);
				} while (i6 > 0);
			}
		} catch (RuntimeException var26) {
			throw bc.a(var26, "af.MA(" + i + ',' + i1 + ',' + unused + ',' + i2 + ',' + i3 + ',' + i4 + ')');
		}
	}
	
	int[] a(byte var1, int var2) {
		try {
			if (var1 < 13) {
				return null;
			} else {
				++L;
				throw new IllegalStateException("This operation does not have a monochrome output");
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "af.F(" + var1 + ',' + var2 + ')');
		}
	}
	
	void f(int var1) {
		try {
			++H;
			if (var1 != 1) {
				b(89, (int) 8);
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "af.L(" + var1 + ')');
		}
	}
	
	static void a(byte unused) {
		try {
			++anInt_o;
			df.s.b(9946);
			df.t.b(9946);
			jf.T.b(9946);
		} catch (RuntimeException var2) {
			throw bc.a(var2, "af.LA(" + unused + ')');
		}
	}
	
	void a(int var1, int var2, og var3) {
		try {
			++anInt_q;
		} catch (RuntimeException var5) {
			throw bc.a(var5, "af.B(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	final void a(byte unused, int i, int i1) {
		try {
			++w;
			int i2 = this.Q != 255 ? this.Q : i;
			if (this.u) {
				this.nd_v = new nd(i2, i, i1);
			} else {
				this.ve_s = new ve(i2, i, i1);
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "af.JA(" + unused + ',' + i + ',' + i1 + ')');
		}
	}
	
	void a(boolean var1) {
		try {
			if (!this.u) {
				this.ve_s.a(false);
				this.ve_s = null;
			}
			
			this.nd_v.a(true);
			this.nd_v = null;
			
			++y;
			if (var1) {
				h(39);
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "af.T(" + var1 + ')');
		}
	}
	
	int[][] b(int var1, byte var2) {
		try {
			++F;
			throw new IllegalStateException("This operation does not have a colour output");
		} catch (RuntimeException var4) {
			throw bc.a(var4, "af.G(" + var1 + ',' + var2 + ')');
		}
	}
	
	final int[] c(int i, int i1, int unused) {
		try {
			++G;
			if (unused < 20) {
				t = -49;
			}
			
			return this.K[i1].u ? this.K[i1].a((byte) 96, i) : this.K[i1].b(i, (byte) 76)[0];
		} catch (RuntimeException var5) {
			throw bc.a(var5, "af.EA(" + i + ',' + i1 + ',' + unused + ')');
		}
	}
	
	static int b(int i, int unused) {
		try {
			++J;
			d d = ob.b(i, -82);
			int i1 = d.I;
			int i2 = d.F;
			int i3 = d.K;
			int i4 = qb.H[i3 + -i2];
			return i4 & sa.c[i1] >> i2;
		} catch (RuntimeException var7) {
			throw bc.a(var7, "af.FA(" + i + ',' + unused + ')');
		}
	}
	
	public static void g(int unused) {
		try {
			B = null;
			N = null;
			P = null;
			D = null;
			newUser2 = null;
			hidden = null;
			O = null;
			newUser = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "af.KA(" + unused + ')');
		}
	}
	
	static void h(int unused) {
		try {
			qf.I = unused;
			++anInt_p;
			nf.S = 0;
			hg.b((byte) 113);//done
			kd.i(127);//done
			tf.a(123);//done
			ve.b(3610);
			int i = 0;
			int pos;
			for (; ~nf.S < ~i; ++i) {
				pos = ue.gb[i];
				if (~lg.j[pos].Ub != ~bi.f) {
					lg.j[pos] = null;
				}
			}
			
			if (~pg.packetBuffer.pointer != ~sh.packetSize) {
				throw new RuntimeException("gpp1 pos:" + pg.packetBuffer.pointer + " psize:" + sh.packetSize);
			} else {
				int playerUpdatePacketPos = 0;
				if (~se.b < ~playerUpdatePacketPos) {
					do {
						if (lg.j[si.cb[playerUpdatePacketPos]] == null) {
							throw new RuntimeException("gpp2 pos:" + playerUpdatePacketPos + " size:" + se.b);
						}
						
						++playerUpdatePacketPos;
					} while (~se.b < ~playerUpdatePacketPos);
				}
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "af.GA(" + unused + ')');
		}
	}
	
	af(int i, boolean flag) {
		try {
			this.K = new af[i];
			this.u = flag;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "af.<init>(" + i + ',' + flag + ')');
		}
	}
	
	static {
		newUser2 = newUser;
		B = new int[4000];
		hidden = rf.a(40, "Hidden)2");
		D = new vc(64);
		N = rf.a(40, "null");
		P = new ae(5000);
	}
}
