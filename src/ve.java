import org.jetbrains.annotations.Contract;

import java.util.Calendar;
import java.util.Date;

final class ve {

	private pi a = new pi();
	static int anInt_b = 2;
	private hb[] c;
	static ob ob_d = rf.a(40, "Ihr Spielkonto wurde deaktiviert)3");
	private int e = -1;
	static ca cacheFile_13;
	static ob ob_g = rf.a(40, "weiss:");
	static int h;
	private int i = 0;
	static int j;
	private int k;
	static int anInt_l = 0;
	static int m;
	private int anInt_n;
	static int o;
	static ae p = new ae(5000);
	static int q;
	static int anInt_r;
	private int[][][] s;
	static int[] t = new int[] {1, 2, 4, 8};
	boolean u = false;

	final void a (boolean var1) {
		try {
			++j;
			int var2 = 0;
			if (!var1) {
				while (var2 < this.k) {
					this.s[var2][0] = null;
					this.s[var2][1] = null;
					this.s[var2][2] = null;
					this.s[var2] = null;
					++var2;
				}

				this.c = null;
				this.s = null;
				this.a.c(90);
				this.a = null;
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ve.E(" + var1 + ')');
		}
	}

	final int[][][] a (int var1) {
		try {
			++h;
			if (var1 != 9924) {
				anInt_l = -62;
			}

			if (this.anInt_n != this.k) {
				throw new RuntimeException("Can only retrieve a full image cache");
			} else {
				int var2 = 0;
				while (this.k > var2) {
					this.c[var2] = qf.u;
					++var2;
				}

				return this.s;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "ve.G(" + var1 + ')');
		}
	}

	public static void a (byte var0) {
		try {
			if (var0 != -83) {
				a((byte) -121);
			}

			ob_g = null;
			cacheFile_13 = null;
			ob_d = null;
			t = null;
			p = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ve.D(" + var0 + ')');
		}
	}

	final int[][] a (int var1, byte var2) {
		int var5 = client.anInt_wb;

		try {
			if (var2 != 45) {
				this.s = null;
			}

			++o;
			if (this.k != this.anInt_n) {
				if (~this.k == -2) {
					this.u = this.e != var1;
					this.e = var1;
					return this.s[0];
				} else {
					hb var3;
					label51:
					{
						var3 = this.c[var1];
						if (var3 != null) {
							this.u = false;
							if (var5 == 0) {
								break label51;
							}
						}

						label36:
						{
							this.u = true;
							if (~this.k < ~this.i) {
								var3 = new hb(var1, this.i);
								++this.i;
								if (var5 == 0) {
									break label36;
								}
							}

							hb var4 = (hb) this.a.d(44);
							var3 = new hb(var1, var4.anInt_r);
							this.c[var4.u] = null;
							var4.c(128);
						}

						this.c[var1] = var3;
					}

					this.a.a(var3, true);
					return this.s[var3.anInt_r];
				}
			} else {
				this.u = this.c[var1] == null;
				this.c[var1] = qf.u;
				return this.s[var1];
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "ve.A(" + var1 + ',' + var2 + ')');
		}
	}

	static void a (wc class_wc, int anInt_n, int n2) {
		final int dummy = client.anInt_wb;
		try {
			++ve.q;
			final Object[] p3 = class_wc.P;
			oh k = ph.a(false, (int) p3[0]);
			if (k == null) {
				return;
			}
			int n3 = 0;
			if (n2 != 26186) {
				return;
			}
			int[] array = k.L;
			mg.f = 0;
			int[] array2 = k.G;
			int a = -1;
			int n4 = -1;
			int n5 = 0;
			try {
				ja.j = new int[k.J];
				qh.c = new ob[k.D];
				int n6 = 0;
				int n7 = 0;
				int n8 = 1;
				while ((~n8) > (~p3.length)) {
					if (!(p3[n8] instanceof Integer)) {
						if ((p3[n8] instanceof ob)) {
							ob q = (ob) p3[n8];
							if (q.a((byte) 42, ld.y)) {
								q = class_wc.q;
							}
							qh.c[n7++] = q;
						}
					} else {
						int n9 = (int) p3[n8];
						if (n9 == -2147483647) {
							n9 = class_wc.x;
						} else if (~n9 == 2147483645) {
							n9 = class_wc.y;
						} else if (~n9 == 2147483644) {
							n9 = ((class_wc.E != null) ? class_wc.E.Ec : -1);
						} else if (n9 == -2147483644) {
							n9 = class_wc.A;
						} else if (n9 == -2147483643) {
							n9 = ((class_wc.E != null) ? class_wc.E.Rb : -1);
						} else if (n9 == -2147483642) {
							n9 = ((class_wc.C != null) ? class_wc.C.Ec : -1);
						} else if (n9 == -2147483641) {
							n9 = ((class_wc.C != null) ? class_wc.C.Rb : -1);
						} else if (~n9 == 2147483639) {
							n9 = class_wc.r;
						} else if (~n9 == 2147483638) {
							n9 = class_wc.s;
						}
						ja.j[n6++] = n9;
					}
					++n8;
				}
				if (~n8 <= ~p3.length) {
					int n10 = 0;
					li class_li;
					int n11;
					oh a2;
					int[] j;
					ob[] c;
					int n12;
					int n13;
					li li2;
					int n14;
					int n15;
					int n16;
					int n17;
					int n18;
					int n19;
					int n20;
					int n21;
					int n22;
					ob h;
					la la;
					boolean boolean_b;
					int n23;
					ra b2;
					int n24;
					ra class_ra;
					ra b3;
					ra b4;
					int n25;
					int n26;
					int n27;
					long n28;
					long n29;
					int n30;
					int n31;
					int n32;
					int n33;
					int n34;
					int n35;
					int n36;
					int n37;
					ob ob;
					ob ob2;
					ob ob3;
					int n38;
					i i;
					ob ob4;
					int n39;
					int n40;
					i class_i_l;
					ob ob5;
					ob ob6;
					ob ob7;
					ob ob8;
					ob a3;
					int n41;
					int n42;
					int a4;
					int n43;
					int n44;
					ob ob9;
					int n45;
					ob ob_ic;
					int n46;
					int n47;
					ob ob10;
					ob c2;
					int n48;
					ob c3;
					int n49;
					int anInt_hb;
					ob ob11;
					ob ob12;
					int hb2;
					ob ic2;
					int n50;
					ob ic3;
					int n51;
					ob ob13;
					int n52;
					int n53;
					ei a5;
					int n54;
					int n55;
					ei a6;
					int n56;
					ei a7;
					int n57;
					ei a8;
					int n58;
					int n59;
					int n60;
					ob a9;
					int n61;
					int n62;
					int n63;
					int n64;
					int n65;
					ob a10;
					int n66;
					int n67;
					int n68;
					int n69;
					int n70;
					int n71;
					ic a11;
					ob ob14;
					int f;
					ob ob15;
					ob ob16;
					int n72;
					ra b5;
					ra b6;
					int length;
					int n73;
					int n74;
					int n75;
					re class_re;
					ra b7;
					ra ra2;
					int n76;
					ra ra3;
					ra ra4;
					ra b8;
					int[] q2;
					ob a12;
					int n77;
					Object[] y;
					int n78;
					int n79;
					ra b9;
					int tb;
					int kc;
					ei a13;
					ra b10;
					int nc;
					ob ob_lb;
					ra b11;
					boolean e;
					int n80;
					int anInt_ac;
					int rb;
					ra b12;
					ra[] xb;
					int n81;
					ra ra5;
					ra ra6;
					ra ra7;
					int ec;
					ra ra8;
					ra b13;
					ra b14;
					int n82;
					ra a14;
					ra b15;
					while (true) {
						++n10;
						if (anInt_n < n10) {
							throw new RuntimeException("slow");
						}
						n4 = array[++a];
						if (n4 < 100) {
							if (n4 == 0) {
								wf.o[n5++] = array2[a];
							} else if (n4 == 1) {
								wf.o[n5++] = sa.c[array2[a]];
							} else if (n4 == 2) {
								sa.c[array2[a]] = wf.o[--n5];
							} else if (n4 == 3) {
								nf.jb[n3++] = k.K[a];
							} else if (n4 == 6) {
								a += array2[a];
							} else if (n4 == 7) {
								n5 -= 2;
								if (~wf.o[1 + n5] != ~wf.o[n5]) {
									a += array2[a];
								}
							} else if (n4 == 8) {
								n5 -= 2;
								if (~wf.o[n5 + 1] == ~wf.o[n5]) {
									a += array2[a];
								}
							} else if (n4 == 9) {
								n5 -= 2;
								if (wf.o[n5] < wf.o[1 + n5]) {
									a += array2[a];
								}
							} else if (n4 == 10) {
								n5 -= 2;
								if (wf.o[n5] > wf.o[n5 + 1]) {
									a += array2[a];
								}
							} else if (n4 == 21) {
								if (mg.f != 0) {
									class_li = sb.ab[--mg.f];
									a = class_li.anInt_a;
									ja.j = class_li.p;
									qh.c = class_li.r;
									k = class_li.k;
									array = k.L;
									array2 = k.G;
								} else {
									return;
								}
							} else if (n4 == 25) {
								wf.o[n5++] = af.b(array2[a], -106);
							} else if (n4 == 27) {
								ii.b(wf.o[--n5], array2[a], 23207);
							} else if (~n4 == -32) {
								n5 -= 2;
								if (wf.o[n5] <= wf.o[n5 + 1]) {
									a += array2[a];
								}
							} else if (n4 == 32) {
								n5 -= 2;
								if (wf.o[n5 + 1] <= wf.o[n5]) {
									a += array2[a];
								}
							} else if (n4 == 33) {
								wf.o[n5++] = ja.j[array2[a]];
							} else if (n4 == 34) {
								ja.j[array2[a]] = wf.o[--n5];
							} else if (n4 == 35) {
								nf.jb[n3++] = qh.c[array2[a]];
							} else if (n4 == 36) {
								qh.c[array2[a]] = nf.jb[--n3];
							} else if (n4 == 37) {
								n11 = array2[a];
								n3 -= n11;
								nf.jb[n3++] = bi.a(-71, n3, n11, nf.jb);
							} else if (n4 == 38) {
								--n5;
							} else if (n4 == 39) {
								--n3;
							} else if (n4 == 40) {
								a2 = ph.a(false, array2[a]);
								j = new int[a2.J];
								c = new ob[a2.D];
								n12 = 0;
								while (a2.O > n12) {
									j[n12] = wf.o[n12 + (-a2.O + n5)];
									++n12;
								}
								n13 = 0;
								while (a2.P > n13) {
									c[n13] = nf.jb[n3 + (-a2.P + n13)];
									++n13;
								}
								n3 -= a2.P;
								n5 -= a2.O;
								li2 = new li();
								li2.p = ja.j;
								li2.anInt_a = a;
								li2.k = k;
								li2.r = qh.c;
								if (sb.ab.length <= mg.f) {
									throw new RuntimeException();
								}
								k = a2;
								a = -1;
								sb.ab[mg.f++] = li2;
								array = k.L;
								array2 = k.G;
								qh.c = c;
								ja.j = j;
							} else if (n4 == 42) {
								wf.o[n5++] = b.fb[array2[a]];
							} else if (n4 == 43) {
								b.fb[array2[a]] = wf.o[--n5];
							} else if (n4 == 44) {
								n14 = (array2[a] & 0xFFFF);
								n15 = array2[a] >> 16;
								n16 = wf.o[--n5];
								if (n16 < 0 || ~n16 < -5001) {
									throw new RuntimeException();
								}
								vc.e[n15] = n16;
								n17 = -1;
								if (n14 == 105) {
									n17 = 0;
								}
								n18 = 0;
								while (~n18 > ~n16) {
									tf.j[n15][n18] = n17;
									++n18;
								}
							} else if (n4 == 45) {
								n19 = array2[a];
								n20 = wf.o[--n5];
								if (n20 < 0 || ~vc.e[n19] >= ~n20) {
									throw new RuntimeException();
								} else {
									wf.o[n5++] = tf.j[n19][n20];
								}
							} else if (n4 == 46) {
								n5 -= 2;
								n21 = wf.o[n5];
								n22 = array2[a];
								if (~n21 > -1 || vc.e[n22] <= n21) {
									throw new RuntimeException();
								} else {
									tf.j[n22][n21] = wf.o[n5 + 1];
								}
							} else if (n4 == 47) {
								h = ab.g[array2[a]];
								if (h == null) {
									h = ib.h;
								} else {
									nf.jb[n3++] = h;
								}
							} else if (n4 == 48) {
								ab.g[array2[a]] = nf.jb[--n3];
							} else if (n4 == 51) {
								la = (la) k.H[array2[a]].a((long) wf.o[--n5], 22346);
								if (la != null) {
									a += la.q;
								}
							}
						} else {
							boolean_b = array2[a] == 1;
							if (~n4 <= -301) {
								if (n4 < 500) {
									if (n4 == 403) {
										n5 -= 2;
										n23 = wf.o[n5];
										if (~n23 <= -8) {
											n23 -= 7;
										}
										le.T.Ac.a(wf.o[1 + n5], n23, 127);
									} else if (n4 == 404) {
										n5 -= 2;
										le.T.Ac.b(84, wf.o[n5 + 1], wf.o[n5]);
									} else if (n4 == 410) {
										le.T.Ac.a((byte) 123, ~wf.o[--n5] != -1);
									}
								} else if ((n4 < 1000 || n4 >= 1100) && (~n4 > -2001 || ~n4 <= -2101)) {
									if ((n4 < 1100 || ~n4 <= -1201) && (~n4 > -2101 || n4 >= 2200)) {
										if ((n4 < 1200 || ~n4 <= -1301) && (~n4 > -2201 || n4 >= 2300)) {
											if ((~n4 <= -1301 && n4 < 1400) || (n4 >= 2300 && n4 < 2400)) {
												if (~n4 <= -2001) {
													b2 = tc.b(wf.o[--n5], -64);
													n4 -= 1000;
												} else {
													b2 = (boolean_b ? oe.e : gb.eb);
												}
												if (n4 == 1300) {
													n24 = -1 + wf.o[--n5];
													if (n24 < 0 || n24 > 9) {
														--n3;
													}
													b2.a(n24, nf.jb[--n3], (byte) (-50));
												} else if (n4 == 1301) {
													n5 -= 2;
													b2.o = ue.a(wf.o[1 + n5], (byte) 56, wf.o[n5]);
												} else if (n4 == 1302) {
													b2.aBoolean_qc = wf.o[--n5] == 1;
												} else if (n4 == 1303) {
													b2.zb = wf.o[--n5];
												} else if (n4 == 1304) {
													b2.ic = wf.o[--n5];
												} else if (n4 == 1305) {
													b2.Mb = nf.jb[--n3];
												} else if (n4 == 1306) {
													b2.f = nf.jb[--n3];
												} else if (n4 == 1307) {
													b2.Mc = null;
												}
											} else if ((n4 < 1400 || ~n4 <= -1501) && (n4 < 2400 || ~n4 <= -2501)) {
												if (n4 >= 1600) {
													if (n4 >= 1700) {
														if (n4 < 1800) {
															class_ra = (boolean_b ? oe.e : gb.eb);
															if (n4 == 1700) {
																wf.o[n5++] = class_ra.Tb;
															} else if (n4 == 1701) {
																if (~class_ra.Tb == 0) {
																	wf.o[n5++] = 0;
																} else {
																	wf.o[n5++] = class_ra.Kc;
																}
															} else if (n4 == 1702) {
																wf.o[n5++] = class_ra.Rb;
															}
														} else if (n4 >= 1900) {
															if (n4 < 2600) {
																b3 = tc.b(wf.o[--n5], -98);
																if (n4 == 2500) {
																	wf.o[n5++] = b3.Nb;
																} else if (n4 == 2501) {
																	wf.o[n5++] = b3.gc;
																} else if (n4 == 2502) {
																	wf.o[n5++] = b3.L;
																} else if (n4 == 2503) {
																	wf.o[n5++] = b3.w;
																} else if (n4 == 2504) {
																	wf.o[n5++] = (b3.E ? 1 : 0);
																} else if (n4 == 2505) {
																	wf.o[n5++] = b3.Ic;
																}
															} else if (n4 >= 2700) {
																if (n4 >= 2800) {
																	if (n4 < 2900) {
																		b4 = tc.b(wf.o[--n5], -44);
																		if (n4 == 2800) {
																			wf.o[n5++] = fc.a(ce.a(b4, 18125), false);
																		} else if (n4 == 2801) {
																			n25 = wf.o[--n5];
																			--n25;
																			if (b4.Mc != null && n25 < b4.Mc.length && b4.Mc[n25] != null) {
																				nf.jb[n3++] = b4.Mc[n25];
																			} else {
																				nf.jb[n3++] = nb.ic;
																			}
																		} else if (n4 == 2802) {
																			if (b4.Mb == null) {
																				nf.jb[n3++] = nb.ic;
																			} else {
																				nf.jb[n3++] = b4.Mb;
																			}
																		}
																	} else if (~n4 <= -3201) {
																		if (~n4 > -3301) {
																			if (n4 == 3200) {
																				n5 -= 3;
																				ih.a(wf.o[1 + n5], wf.o[n5], 0, wf.o[2 + n5]);
																			} else if (n4 == 3201) {
																				tc.b(wf.o[--n5], (byte) 114);
																			} else if (n4 == 3202) {
																				n5 -= 2;
																				nf.d(n2 ^ 0x662C, wf.o[n5 + 1], wf.o[n5]);
																			}
																		} else if (n4 < 3400) {
																			if (n4 == 3300) {
																				wf.o[n5++] = bi.f;
																			} else if (n4 == 3301) {
																				n5 -= 2;
																				wf.o[n5++] = di.b(wf.o[1 + n5], wf.o[n5], 0);
																			} else if (n4 == 3302) {
																				n5 -= 2;
																				wf.o[n5++] = lh.a(wf.o[1 + n5], wf.o[n5], (byte) 85);
																			} else if (n4 == 3303) {
																				n5 -= 2;
																				wf.o[n5++] = l.a(wf.o[n5], wf.o[1 + n5], (byte) 11);
																			} else if (n4 == 3304) {
																				wf.o[n5++] = vd.a(wf.o[--n5], (byte) (-120)).O;
																			} else if (n4 == 3305) {
																				wf.o[n5++] = de.r[wf.o[--n5]];
																			} else if (n4 == 3306) {
																				wf.o[n5++] = gh.mb[wf.o[--n5]];
																			} else if (n4 == 3307) {
																				wf.o[n5++] = dg.Dc[wf.o[--n5]];
																			} else if (n4 == 3308) {
																				wf.o[n5++] = (le.T.coordY >> 7) + ic.entityYPosition + (gf.G << 28) + ((le.T.coordX >> 7) + ic.entityYPosition << 14);
																			} else if (n4 == 3309) {
																				wf.o[n5++] = bd.b(wf.o[--n5] >> 14, 16383);
																			} else if (n4 == 3310) {
																				wf.o[n5++] = wf.o[--n5] >> 28;
																			} else if (n4 == 3311) {
																				wf.o[n5++] = bd.b(16383, wf.o[--n5]);
																			} else if (n4 == 3312) {
																				wf.o[n5++] = li.members ? 1 : 0;
																			} else if (n4 == 3313) {
																				n5 -= 2;
																				wf.o[n5++] = di.b(wf.o[1 + n5], wf.o[n5] + 32768, 0);
																			} else if (n4 == 3314) {
																				n5 -= 2;
																				wf.o[n5++] = lh.a(wf.o[1 + n5], wf.o[n5] + 32768, (byte) 101);
																			} else if (n4 == 3315) {
																				n5 -= 2;
																				wf.o[n5++] = l.a(32768 + wf.o[n5], wf.o[1 + n5], (byte) 56);
																			} else if (n4 == 3316) {
																				if (~aa.F > -3) {
																					wf.o[n5++] = 0;
																				} else {
																					wf.o[n5++] = aa.F;
																				}
																			} else if (n4 == 3317) {
																				wf.o[n5++] = kg.a;
																			} else if (n4 == 3318) {
																				wf.o[n5++] = rd.P;
																			} else if (n4 == 3321) {
																				wf.o[n5++] = l.d;
																			} else if (n4 == 3322) {
																				wf.o[n5++] = ra.I;
																			} else if (n4 == 3323) {
																				if (cf.cb >= 5 && ~cf.cb >= -10) {
																					wf.o[n5++] = 1;
																				} else {
																					wf.o[n5++] = 0;
																				}
																			} else if (n4 == 3324) {
																				if (~cf.cb > -6 || cf.cb > 9) {
																					wf.o[n5++] = 0;
																				} else {
																					wf.o[n5++] = cf.cb;
																				}
																			} else if (n4 == 3325) {
																				if (n.k > 0) {
																					wf.o[n5++] = 1;
																				} else {
																					wf.o[n5++] = 0;
																				}
																			} else if (n4 == 3326) {
																				wf.o[n5++] = le.T.Cc;
																			} else if (n4 == 3327) {
																				wf.o[n5++] = (le.T.Ac.r ? 1 : 0);
																			}
																		} else if (~n4 <= -3501) {
																			if (~n4 <= -3701) {
																				if (~n4 > -4001) {
																					if (n4 == 3903) {
																						wf.o[n5++] = kg.d[wf.o[--n5]].b(52);
																					} else if (n4 == 3904) {
																						wf.o[n5++] = kg.d[wf.o[--n5]].anInt_d;
																					} else if (n4 == 3905) {
																						wf.o[n5++] = kg.d[wf.o[--n5]].i;
																					} else if (n4 == 3906) {
																						wf.o[n5++] = kg.d[wf.o[--n5]].f;
																					} else if (n4 == 3907) {
																						wf.o[n5++] = kg.d[wf.o[--n5]].p;
																					} else if (n4 == 3908) {
																						wf.o[n5++] = kg.d[wf.o[--n5]].k;
																					} else if (n4 == 3910) {
																						wf.o[n5++] = ((kg.d[wf.o[--n5]].b((byte) (-105)) == 0) ? 1 : 0);
																					} else if (n4 == 3911) {
																						wf.o[n5++] = ((~kg.d[wf.o[--n5]].b((byte) (-85)) == 0xFFFFFFFD) ? 1 : 0);
																					} else if (n4 == 3912) {
																						wf.o[n5++] = ((kg.d[wf.o[--n5]].b((byte) (-81)) == 5) ? 1 : 0);
																					} else if (n4 == 3913) {
																						wf.o[n5++] = ((kg.d[wf.o[--n5]].b((byte) (-112)) == 1) ? 1 : 0);
																					}
																				} else if (n4 < 4100) {
																					if (n4 == 4000) {
																						n5 -= 2;
																						wf.o[n5++] = wf.o[1 + n5] + wf.o[n5];
																					} else if (n4 == 4001) {
																						n5 -= 2;
																						wf.o[n5++] = wf.o[n5] + -wf.o[n5 + 1];
																					} else if (n4 == 4002) {
																						n5 -= 2;
																						wf.o[n5++] = wf.o[1 + n5] * wf.o[n5];
																					} else if (n4 == 4003) {
																						n5 -= 2;
																						wf.o[n5++] = wf.o[n5] / wf.o[n5 + 1];
																					} else if (n4 == 4004) {
																						wf.o[n5++] = (int) (Math.random() * wf.o[--n5]);
																					} else if (n4 == 4005) {
																						wf.o[n5++] = (int) ((wf.o[--n5] + 1) * Math.random());
																					} else if (n4 == 4006) {
																						n5 -= 5;
																						n26 = wf.o[n5];
																						n27 = wf.o[2 + n5];
																						wf.o[n5++] = (wf.o[n5 + 1] + -n26) * (-n27 + wf.o[4 + n5]) / (wf.o[3 + n5] + -n27) + n26;
																					} else if (n4 == 4007) {
																						n5 -= 2;
																						n28 = wf.o[1 + n5];
																						n29 = wf.o[n5];
																						wf.o[n5++] = (int) (n28 * n29 / 100L + n29);
																					} else if (n4 == 4008) {
																						n5 -= 2;
																						wf.o[n5++] = ff.b(wf.o[n5], 1 << wf.o[1 + n5]);
																					} else if (n4 == 4009) {
																						n5 -= 2;
																						wf.o[n5++] = bd.b(-1 + -(1 << wf.o[n5 + 1]), wf.o[n5]);
																					} else if (n4 == 4010) {
																						n5 -= 2;
																						wf.o[n5++] = ((bd.b(wf.o[n5], 1 << wf.o[1 + n5]) != 0) ? 1 : 0);
																					} else if (n4 == 4011) {
																						n5 -= 2;
																						wf.o[n5++] = wf.o[n5] % wf.o[n5 + 1];
																					} else if (n4 == 4012) {
																						n5 -= 2;
																						n30 = wf.o[1 + n5];
																						n31 = wf.o[n5];
																						if (n31 != 0) {
																							wf.o[n5++] = (int) Math.pow(n31, n30);
																						} else {
																							wf.o[n5++] = 0;
																						}
																					} else if (n4 == 4013) {
																						n5 -= 2;
																						n32 = wf.o[1 + n5];
																						n33 = wf.o[n5];
																						if (n33 != 0) {
																							if (n32 != 0) {
																								wf.o[n5++] = (int) Math.pow(n33, 1.0 / n32);
																							} else {
																								wf.o[n5++] = Integer.MAX_VALUE;
																							}
																						} else {
																							wf.o[n5++] = 0;
																						}
																					} else if (n4 == 4014) {
																						n5 -= 2;
																						wf.o[n5++] = bd.b(wf.o[n5 + 1], wf.o[n5]);
																					} else if (n4 == 4015) {
																						n5 -= 2;
																						wf.o[n5++] = ff.b(wf.o[1 + n5], wf.o[n5]);
																					} else if (n4 == 4016) {
																						n5 -= 2;
																						n34 = wf.o[n5];
																						n35 = wf.o[1 + n5];
																						wf.o[n5++] = ((~n34 > ~n35) ? n34 : n35);
																					} else if (n4 == 4017) {
																						n5 -= 2;
																						n36 = wf.o[1 + n5];
																						n37 = wf.o[n5];
																						wf.o[n5++] = ((~n36 <= ~n37) ? n36 : n37);
																					} else if (n4 == 4018) {
																						n5 -= 3;
																						wf.o[n5++] = wf.o[n5 + 2] * wf.o[n5] / wf.o[n5 + 1];
																					}
																				} else if (~n4 > -4201) {
																					if (n4 == 4100) {
																						nf.jb[n3++] = wc.a(new ob[] {nf.jb[--n3], hh.a((byte) 93, wf.o[--n5])}, -3);
																					} else if (n4 == 4101) {
																						n3 -= 2;
																						nf.jb[n3++] = wc.a(new ob[] {nf.jb[n3], nf.jb[1 + n3]}, -3);
																					} else if (n4 == 4102) {
																						nf.jb[n3++] = wc.a(new ob[] {nf.jb[--n3], oh.a((byte) (-101), true, wf.o[--n5])}, ph.a(n2, -26185));
																					} else if (n4 == 4103) {
																						nf.jb[n3++] = nf.jb[--n3].c((byte) (-79));
																					} else if (n4 == 4104) {
																						kg.r.setTime(new Date(wf.o[--n5] * 86400000L + 1014768000000L));
																						nf.jb[n3++] = wc.a(new ob[] {hh.a((byte) 93, kg.r.get(Calendar.DATE)), jd.h, lb.W[kg.r.get(Calendar.MONTH)], jd.h, hh.a((byte) 93, kg.r.get(Calendar.YEAR))}, -3);
																					} else if (n4 == 4105) {
																						n3 -= 2;
																						ob = nf.jb[1 + n3];
																						ob2 = nf.jb[n3];
																						if (le.T.Ac == null || !le.T.Ac.r) {
																							nf.jb[n3++] = ob2;
																						} else {
																							nf.jb[n3++] = ob;
																						}
																					} else if (n4 == 4106) {
																						nf.jb[n3++] = hh.a((byte) 93, wf.o[--n5]);
																					} else if (n4 == 4107) {
																						n3 -= 2;
																						wf.o[n5++] = nf.jb[n3].a(false, nf.jb[1 + n3]);
																					} else if (n4 == 4108) {
																						n5 -= 2;
																						ob3 = nf.jb[--n3];
																						n38 = wf.o[n5];
																						i = new i(ve.cacheFile_13.a((byte) (-103), 0, wf.o[n5 + 1]));
																						i.a(ca.gb, null);
																						wf.o[n5++] = i.a(ob3, n38);
																					} else if (n4 == 4109) {
																						n5 -= 2;
																						ob4 = nf.jb[--n3];
																						n39 = wf.o[1 + n5];
																						n40 = wf.o[n5];
																						class_i_l = new i(ve.cacheFile_13.a((byte) 64, 0, n39));
																						class_i_l.a(ca.gb, null);
																						wf.o[n5++] = class_i_l.b(ob4, n40);
																					} else if (n4 == 4110) {
																						n3 -= 2;
																						ob5 = nf.jb[n3];
																						ob6 = nf.jb[n3 + 1];
																						if (wf.o[--n5] != 1) {
																							nf.jb[n3++] = ob6;
																						} else {
																							nf.jb[n3++] = ob5;
																						}
																					} else if (n4 == 4111) {
																						nf.jb[n3++] = nh.a(nf.jb[--n3]);
																					} else if (n4 == 4112) {
																						nf.jb[n3++] = nf.jb[--n3].c(wf.o[--n5], -109);
																					} else if (n4 == 4113) {
																						wf.o[n5++] = (hb.a(true, wf.o[--n5]) ? 1 : 0);
																					} else if (n4 == 4114) {
																						wf.o[n5++] = (gf.a((byte) (-80), wf.o[--n5]) ? 1 : 0);
																					} else if (n4 == 4115) {
																						wf.o[n5++] = (dh.a(126, wf.o[--n5]) ? 1 : 0);
																					} else if (n4 == 4116) {
																						wf.o[n5++] = (og.o(-58, wf.o[--n5]) ? 1 : 0);
																					} else if (n4 == 4117) {
																						ob7 = nf.jb[--n3];
																						if (ob7 != null) {
																							wf.o[n5++] = ob7.a(false);
																						} else {
																							wf.o[n5++] = 0;
																						}
																					} else if (n4 == 4118) {
																						n5 -= 2;
																						nf.jb[n3++] = nf.jb[--n3].a(wf.o[1 + n5], wf.o[n5], (byte) 35);
																					} else if (n4 == 4119) {
																						ob8 = nf.jb[--n3];
																						a3 = vb.a(ob8.a(false), 256);
																						n41 = 0;
																						n42 = 0;
																						while (~n2 > ~ob8.a(false)) {
																							a4 = ob8.a(125, n42);
																							if (a4 == 60) {
																								n41 = 1;
																							} else if (a4 != 62) {
																								if (n41 == 0) {
																									a3.getChar(-58, a4);
																								}
																							} else {
																								n41 = 0;
																							}
																							++n42;
																						}
																						a3.i((byte) 90);
																						nf.jb[n3++] = a3;
																					} else if (n4 == 4120) {
																						n5 -= 2;
																						wf.o[n5++] = nf.jb[--n3].a(-123, wf.o[n5], wf.o[1 + n5]);
																					} else if (n4 == 4121) {
																						n3 -= 2;
																						wf.o[n5++] = nf.jb[n3].a(-1, wf.o[--n5], nf.jb[1 + n3]);
																					}
																				} else if (~n4 <= -4301) {
																					if (~n4 > -5101) {
																						if (n4 == 5000) {
																							wf.o[n5++] = gg.w;
																						} else if (n4 == 5001) {
																							n5 -= 3;
																							gg.w = wf.o[n5];
																							ca.Qb = wf.o[n5 + 1];
																							++qi.u;
																							ng.B = wf.o[2 + n5];
																							af.P.p(221, 12885);
																							af.P.writeByte(82, gg.w);
																							af.P.writeByte(119, ca.Qb);
																							af.P.writeByte(111, ng.B);
																						} else if (n4 == 5002) {
																							n5 -= 2;
																							++hi.j;
																							n43 = wf.o[n5];
																							n44 = wf.o[1 + n5];
																							ob9 = nf.jb[--n3];
																							af.P.p(75, 12885);
																							af.P.writeLong(-117, ob9.e(n2 ^ 0x2B04));
																							af.P.writeByte(105, n43 - 1);
																							af.P.writeByte(127, n44);
																						} else if (n4 == 5003) {
																							n45 = wf.o[--n5];
																							ob_ic = null;
																							if (n45 < 100) {
																								ob_ic = wf.l[n45];
																							}
																							if (ob_ic == null) {
																								ob_ic = nb.ic;
																							}
																							nf.jb[n3++] = ob_ic;
																						} else if (n4 == 5004) {
																							n46 = wf.o[--n5];
																							n47 = -1;
																							if (n46 < 100 && wf.l[n46] != null) {
																								n47 = ld.ints_v[n46];
																							}
																							wf.o[n5++] = n47;
																						} else if (n4 == 5005) {
																							wf.o[n5++] = ca.Qb;
																						} else if (n4 == 5008) {
																							ob10 = nf.jb[--n3];
																							if (ob10.a(123, ch.V)) {
																								ef.a((byte) 26, ob10); //Commands
																							}
																							++nf.X;
																							c2 = ob10.c((byte) 78);
																							n48 = 0;
																							if (c2.a(-26, md.yellow_keyword2)) {
																								n48 = 0;
																								ob10 = ob10.a((byte) (-116), md.yellow_keyword2.a(false));
																							} else if (!c2.a(-119, ae.red_keyword2)) {
																								if (c2.a(-17, eh.green_keyword2)) {
																									ob10 = ob10.a((byte) (-125), eh.green_keyword2.a(false));
																									n48 = 2;
																								} else if (!c2.a(118, dc.c)) {
																									if (c2.a(100, wc.v)) {
																										ob10 = ob10.a((byte) (-109), wc.v.a(false));
																										n48 = 4;
																									} else if (!c2.a(124, dh.ob_d)) {
																										if (!c2.a(126, client.ob_bb)) {
																											if (!c2.a(n2 ^ 0xFFFF9984, je.Y)) {
																												if (!c2.a(119, qh.i)) {
																													if (c2.a(n2 ^ 0x663E, si.ab)) {
																														ob10 = ob10.a((byte) (-92), si.ab.a(false));
																														n48 = 9;
																													} else if (c2.a(122, g.I)) {
																														n48 = 10;
																														ob10 = ob10.a((byte) 119, g.I.a(false));
																													} else if (c2.a(-124, fg.n)) {
																														n48 = 11;
																														ob10 = ob10.a((byte) 70, fg.n.a(false));
																													} else if (oh.M != 0) {
																														if (!c2.a(n2 - 26235, md.a)) {
																															if (!c2.a(n2 ^ 0x6633, ae.Yb)) {
																																if (c2.a(-94, eh.X)) {
																																	ob10 = ob10.a((byte) (-123), eh.X.a(false));
																																	n48 = 2;
																																} else if (!c2.a(104, dc.h)) {
																																	if (!c2.a(-83, wc.M)) {
																																		if (!c2.a(-34, dh.p)) {
																																			if (c2.a(104, client.S)) {
																																				ob10 = ob10.a((byte) (-96), client.S.a(false));
																																				n48 = 6;
																																			} else if (c2.a(n2 ^ 0x6617, je.S)) {
																																				ob10 = ob10.a((byte) 54, je.S.a(false));
																																				n48 = 7;
																																			} else if (c2.a(-67, qh.j)) {
																																				n48 = 8;
																																				ob10 = ob10.a((byte) 103, qh.j.a(false));
																																			} else if (c2.a(-119, si.Z)) {
																																				ob10 = ob10.a((byte) (-123), si.Z.a(false));
																																				n48 = 9;
																																			} else if (!c2.a(-118, g.N)) {
																																				if (c2.a(n2 ^ 0x662B, fg.e)) {
																																					n48 = 11;
																																					ob10 = ob10.a((byte) (-101), fg.e.a(false));
																																				}
																																			} else {
																																				ob10 = ob10.a((byte) 51, g.N.a(false));
																																				n48 = 10;
																																			}
																																		} else {
																																			n48 = 5;
																																			ob10 = ob10.a((byte) 73, dh.p.a(false));
																																		}
																																	} else {
																																		ob10 = ob10.a((byte) 100, wc.M.a(false));
																																		n48 = 4;
																																	}
																																} else {
																																	ob10 = ob10.a((byte) 73, dc.h.a(false));
																																	n48 = 3;
																																}
																															} else {
																																ob10 = ob10.a((byte) (-117), ae.Yb.a(false));
																																n48 = 1;
																															}
																														} else {
																															n48 = 0;
																															ob10 = ob10.a((byte) (-103), md.a.a(false));
																														}
																													}
																												} else {
																													ob10 = ob10.a((byte) 125, qh.i.a(false));
																													n48 = 8;
																												}
																											} else {
																												ob10 = ob10.a((byte) 97, je.Y.a(false));
																												n48 = 7;
																											}
																										} else {
																											ob10 = ob10.a((byte) (-108), client.ob_bb.a(false));
																											n48 = 6;
																										}
																									} else {
																										n48 = 5;
																										ob10 = ob10.a((byte) 38, dh.ob_d.a(false));
																									}
																								} else {
																									ob10 = ob10.a((byte) (-106), dc.c.a(false));
																									n48 = 3;
																								}
																							} else {
																								ob10 = ob10.a((byte) (-98), ae.red_keyword2.a(false));
																								n48 = 1;
																							}
																							c3 = ob10.c((byte) 51);
																							n49 = 0;
																							if (!c3.a(108, ag.c)) {
																								if (!c3.a(n2 ^ 0xFFFF99A5, ia.db)) {
																									if (c3.a(-119, qi.w)) {
																										ob10 = ob10.a((byte) (-90), qi.w.a(false));
																										n49 = 3;
																									} else if (!c3.a(89, ih.E)) {
																										if (!c3.a(n2 ^ 0xFFFF9994, ef.Y)) {
																											if (oh.M != 0) {
																												if (c3.a(100, ag.a)) {
																													ob10 = ob10.a((byte) (-127), ag.a.a(false));
																													n49 = 1;
																												} else if (c3.a(-118, ia.X)) {
																													ob10 = ob10.a((byte) (-115), ia.X.a(false));
																													n49 = 2;
																												} else if (!c3.a(108, qi.r)) {
																													if (!c3.a(-56, ih.d)) {
																														if (c3.a(115, ef.ob_fb)) {
																															n49 = 5;
																															ob10 = ob10.a((byte) 100, ef.ob_fb.a(false));
																														}
																													} else {
																														ob10 = ob10.a((byte) (-112), ih.d.a(false));
																														n49 = 4;
																													}
																												} else {
																													n49 = 3;
																													ob10 = ob10.a((byte) (-115), qi.r.a(false));
																												}
																											}
																										} else {
																											n49 = 5;
																											ob10 = ob10.a((byte) (-116), ef.Y.a(false));
																										}
																									} else {
																										n49 = 4;
																										ob10 = ob10.a((byte) 93, ih.E.a(false));
																									}
																								} else {
																									ob10 = ob10.a((byte) (-117), ia.db.a(false));
																									n49 = 2;
																								}
																							} else {
																								ob10 = ob10.a((byte) 83, ag.c.a(false));
																								n49 = 1;
																							}
																							af.P.p(124, 12885);
																							af.P.writeByte(101, 0);
																							anInt_hb = af.P.pointer;
																							af.P.writeByte(121, n48);
																							af.P.writeByte(112, n49);
																							sb.a(af.P, ob10, n2 - 26297);
																							af.P.c(-anInt_hb + af.P.pointer, (byte) 17);
																						} else if (n4 == 5009) {
																							++se.g;
																							n3 -= 2;
																							ob11 = nf.jb[n3];
																							ob12 = nf.jb[1 + n3];
																							af.P.p(122, 12885);
																							af.P.writeByte(96, 0);
																							hb2 = af.P.pointer;
																							af.P.writeLong(-116, ob11.e(19790));
																							sb.a(af.P, ob12, 100);
																							af.P.c(-hb2 + af.P.pointer, (byte) 17);
																						} else if (n4 == 5010) {
																							ic2 = null;
																							n50 = wf.o[--n5];
																							if (n50 < 100) {
																								ic2 = jg.b[n50];
																							}
																							if (ic2 == null) {
																								ic2 = nb.ic;
																							}
																							nf.jb[n3++] = ic2;
																						} else if (n4 == 5011) {
																							ic3 = null;
																							n51 = wf.o[--n5];
																							if (n51 < 100) {
																								ic3 = client.V[n51];
																							}
																							if (ic3 == null) {
																								ic3 = nb.ic;
																							}
																							nf.jb[n3++] = ic3;
																						} else if (n4 == 5015) {
																							if (le.T != null && le.T.Ic != null) {
																								ob13 = le.T.Ic;
																							} else {
																								ob13 = kf.l;
																							}
																							nf.jb[n3++] = ob13;
																						} else if (n4 == 5016) {
																							wf.o[n5++] = ng.B;
																						} else if (n4 == 5017) {
																							wf.o[n5++] = ki.u;
																						}
																					} else if (~n4 > -5201) {
																						if (n4 == 5100) {
																							if (!fi.t[86]) {
																								wf.o[n5++] = 0;
																							} else {
																								wf.o[n5++] = 1;
																							}
																						} else if (n4 == 5101) {
																							if (fi.t[82]) {
																								wf.o[n5++] = 1;
																							} else {
																								wf.o[n5++] = 0;
																							}
																						} else if (n4 == 5102) {
																							if (fi.t[81]) {
																								wf.o[n5++] = 1;
																							} else {
																								wf.o[n5++] = 0;
																							}
																						}
																					}
																				} else if (n4 == 4200) {
																					nf.jb[n3++] = jg.a((byte) (-61), wf.o[--n5]).name;
																				} else if (n4 == 4201) {
																					n5 -= 2;
																					n52 = wf.o[n5];
																					n53 = wf.o[1 + n5];
																					a5 = jg.a((byte) (-61), n52);
																					if (n53 >= 1 && n53 <= 5 && a5.groundOption[n53 - 1] != null) {
																						nf.jb[n3++] = a5.groundOption[n53 - 1];
																					} else {
																						nf.jb[n3++] = nb.ic;
																					}
																				} else if (n4 == 4202) {
																					n5 -= 2;
																					n54 = wf.o[n5];
																					n55 = wf.o[n5 + 1];
																					a6 = jg.a((byte) (-61), n54);
																					if (n55 >= 1 && n55 <= 5 && a6.inventoryOption[-1 + n55] != null) {
																						nf.jb[n3++] = a6.inventoryOption[n55 - 1];
																					} else {
																						nf.jb[n3++] = nb.ic;
																					}
																				} else if (n4 == 4203) {
																					wf.o[n5++] = jg.a((byte) (-61), wf.o[--n5]).Gb;
																				} else if (n4 == 4204) {
																					wf.o[n5++] = ((jg.a((byte) (-61), wf.o[--n5]).X == 1) ? 1 : 0);
																				} else if (n4 == 4205) {
																					n56 = wf.o[--n5];
																					a7 = jg.a((byte) (-61), n56);
																					if (~a7.ab == 0 && ~a7.T <= -1) {
																						wf.o[n5++] = a7.T;
																					} else {
																						wf.o[n5++] = n56;
																					}
																				} else if (n4 == 4206) {
																					n57 = wf.o[--n5];
																					a8 = jg.a((byte) (-61), n57);
																					if (a8.ab < 0 || ~a8.T > -1) {
																						wf.o[n5++] = n57;
																					} else {
																						wf.o[n5++] = a8.T;
																					}
																				} else if (n4 == 4207) {
																					wf.o[n5++] = (jg.a((byte) (-61), wf.o[--n5]).xb ? 1 : 0);
																				} else if (n4 == 4210) {
																					fg.a(0, nf.jb[--n3], wf.o[--n5] == 1);
																				} else if (n4 == 4111) {
																					if (ii.q != null && ~ve.anInt_r > ~jf.Z) {
																						wf.o[n5++] = bd.b((int) ii.q[ve.anInt_r++], 65535);
																					} else {
																						wf.o[n5++] = -1;
																					}
																				} else if (n4 == 4212) {
																					ve.anInt_r = 0;
																				}
																			} else if (n4 == 3600) {
																				if (ch.bb != 0) {
																					if (ch.bb == 1) {
																						wf.o[n5++] = -1;
																					} else {
																						wf.o[n5++] = ii.o;
																					}
																				} else {
																					wf.o[n5++] = -2;
																				}
																			} else if (n4 == 3601) {
																				n58 = wf.o[--n5];
																				if (ch.bb != 2 || ~ii.o >= ~n58) {
																					nf.jb[n3++] = nb.ic;
																				} else {
																					nf.jb[n3++] = si.V[n58];
																				}
																			} else if (n4 == 3602) {
																				n59 = wf.o[--n5];
																				if (ch.bb == 2 && ii.o > n59) {
																					wf.o[n5++] = kd.W[n59];
																				} else {
																					wf.o[n5++] = 0;
																				}
																			} else if (n4 == 3603) {
																				n60 = wf.o[--n5];
																				if (~ch.bb != -3 || ~n60 <= ~ii.o) {
																					wf.o[n5++] = 0;
																				} else {
																					wf.o[n5++] = ud.gc[n60];
																				}
																			} else if (n4 == 3604) {
																				n.a(wf.o[--n5], -36, nf.jb[--n3]);
																			} else if (n4 == 3605) {
																				na.a((byte) (-74), nf.jb[--n3].e(19790));
																			} else if (n4 == 3606) {
																				ja.a(nf.jb[--n3].e(n2 - 6396), 113);
																			} else if (n4 == 3607) {
																				r.a(0, nf.jb[--n3].e(n2 ^ 0x2B04));
																			} else if (n4 == 3608) {
																				vb.a((byte) 77, nf.jb[--n3].e(19790));
																			} else if (n4 == 3609) {
																				a9 = nf.jb[--n3];
																				if (a9.a(105, re.C) || a9.a(104, ga.m)) {
																					a9 = a9.a((byte) (-94), 7);
																				}
																				wf.o[n5++] = ph.a(a9, (byte) -115) ? 1 : 0;
																			} else if (n4 == 3610) {
																				n61 = wf.o[--n5];
																				if (ch.bb == 2 && ii.o > n61) {
																					nf.jb[n3++] = cd.n[n61];
																				} else {
																					nf.jb[n3++] = nb.ic;
																				}
																			} else if (n4 == 3611) {
																				if (jh.e != null) {
																					nf.jb[n3++] = jh.e.a(ph.a(n2, 26140));
																				} else {
																					nf.jb[n3++] = nb.ic;
																				}
																			} else if (n4 == 3612) {
																				if (jh.e != null) {
																					wf.o[n5++] = oc.d;
																				} else {
																					wf.o[n5++] = 0;
																				}
																			} else if (n4 == 3613) {
																				n62 = wf.o[--n5];
																				if (jh.e != null && n62 < oc.d) {
																					nf.jb[n3++] = sa.f[n62].o.a(13);
																				} else {
																					nf.jb[n3++] = nb.ic;
																				}
																			} else if (n4 == 3614) {
																				n63 = wf.o[--n5];
																				if (jh.e != null && oc.d > n63) {
																					wf.o[n5++] = sa.f[n63].A;
																				} else {
																					wf.o[n5++] = 0;
																				}
																			} else if (n4 == 3615) {
																				n64 = wf.o[--n5];
																				if (jh.e != null && ~n64 > ~oc.d) {
																					wf.o[n5++] = sa.f[n64].aByte_s;
																				} else {
																					wf.o[n5++] = 0;
																				}
																			} else if (n4 == 3616) {
																				wf.o[n5++] = me.f;
																			} else if (n4 == 3617) {
																				ob_d.a((byte) 6, nf.jb[--n3]);
																			} else if (n4 == 3618) {
																				wf.o[n5++] = lh.U;
																			} else if (n4 == 3619) {
																				oc.a(n2 - 26239, nf.jb[--n3].e(19790));
																			} else if (n4 == 3620) {
																				pb.a((byte) 10);
																			} else if (n4 == 3621) {
																				if (ch.bb != 0) {
																					wf.o[n5++] = jg.s;
																				} else {
																					wf.o[n5++] = -1;
																				}
																			} else if (n4 == 3622) {
																				n65 = wf.o[--n5];
																				if (~ch.bb == -1 || ~jg.s >= ~n65) {
																					nf.jb[n3++] = nb.ic;
																				} else {
																					nf.jb[n3++] = ug.a(pe.db[n65], 0).a(96);
																				}
																			} else if (n4 == 3623) {
																				a10 = nf.jb[--n3];
																				if (a10.a(n2 ^ -26123, re.C) || a10.a(127, ga.m)) {
																					a10 = a10.a((byte) 107, 7);
																				}
																				wf.o[n5++] = (na.a(31, a10) ? 1 : 0);
																			} else if (n4 == 3624) {
																				n66 = wf.o[--n5];
																				if (sa.f == null || ~oc.d >= ~n66 || !sa.f[n66].o.b((byte) (-95), le.T.Ic)) {
																					wf.o[n5++] = 0;
																				} else {
																					wf.o[n5++] = 1;
																				}
																			} else if (n4 == 3625) {
																				if (ac.p == null) {
																					nf.jb[n3++] = nb.ic;
																				} else {
																					nf.jb[n3++] = ac.p.a(ph.a(n2, 26139));
																				}
																			} else if (n4 == 3626) {
																				n67 = wf.o[--n5];
																				if (jh.e == null || ~n67 <= ~oc.d) {
																					nf.jb[n3++] = nb.ic;
																				} else {
																					nf.jb[n3++] = sa.f[n67].y;
																				}
																			}
																		} else if (n4 == 3400) {
																			n5 -= 2;
																			nf.jb[n3++] = ig.a(78, wf.o[n5]).b(wf.o[n5 + 1], -27);
																		} else if (n4 == 3408) {
																			n5 -= 4;
																			n68 = wf.o[3 + n5];
																			n69 = wf.o[n5 + 1];
																			n70 = wf.o[n5 + 2];
																			n71 = wf.o[n5];
																			a11 = ig.a(104, n70);
																			if (a11.U != n71 || a11.K != n69) {
																				if (n69 != 115) {
																					wf.o[n5++] = 0;
																				} else {
																					nf.jb[n3++] = ib.h;
																				}
																			} else {
																				if (n69 != 115) {
																					wf.o[n5++] = a11.a((byte) 55, n68);
																				} else {
																					nf.jb[n3++] = a11.b(n68, -32);
																				}
																			}
																		}
																	} else if (n4 == 3100) {
																		nb.a(0, (byte) (-124), nb.ic, nf.jb[--n3]);
																	} else if (n4 == 3101) {
																		n5 -= 2;
																		ig.a(wf.o[n5], 0, wf.o[n5 + 1], le.T);
																	} else if (n4 == 3103) {
																		ta.g(108015568);
																	} else if (n4 == 3104) {
																		ob14 = nf.jb[--n3];
																		++aa.L;
																		f = 0;
																		if (ob14.g((byte) 107)) {
																			f = ob14.f(10);
																		}
																		af.P.p(186, 12885);
																		af.P.b(f, (byte) 27);
																	} else if (n4 == 3105) {
																		++ri.e;
																		ob15 = nf.jb[--n3];
																		af.P.p(207, 12885);
																		af.P.writeLong(-102, ob15.e(19790));
																	} else if (n4 == 3106) {
																		++qc.z;
																		ob16 = nf.jb[--n3];
																		af.P.p(113, n2 ^ 0x541F);
																		af.P.writeByte(n2 ^ 0x6601, ob16.a(false) + 1);
																		af.P.writeString(ob16, (byte) 32);
																	} else if (n4 == 3107) {
																		d.a(wf.o[--n5], nf.jb[--n3], -102);
																	} else if (n4 == 3108) {
																		n5 -= 3;
																		vg.a(tc.b(wf.o[n5 + 2], n2 - 26235), wf.o[n5], wf.o[n5 + 1], -54);
																	} else if (n4 == 3109) {
																		n5 -= 2;
																		vg.a(boolean_b ? oe.e : gb.eb, wf.o[n5], wf.o[n5 + 1], -59);
																	} else if (n4 == 3110) {
																		++ub.e;
																		n72 = wf.o[--n5];
																		af.P.p(170, 12885);
																		af.P.d(n2 + 708, n72);
																	}
																} else if (n4 == 2700) {
																	wf.o[n5++] = tc.b(wf.o[--n5], -84).Tb;
																} else if (n4 == 2701) {
																	b5 = tc.b(wf.o[--n5], -98);
																	if (b5.Tb == -1) {
																		wf.o[n5++] = 0;
																	} else {
																		wf.o[n5++] = b5.Kc;
																	}
																} else if (n4 == 2702) {
																	if (rd.J.a((long) wf.o[--n5], n2 - 3840) == null) {
																		wf.o[n5++] = 0;
																	} else {
																		wf.o[n5++] = 1;
																	}
																} else if (n4 == 2703) {
																	b6 = tc.b(wf.o[--n5], n2 ^ 0xFFFF9989);
																	if (b6.xb == null) {
																		wf.o[n5++] = 0;
																	} else {
																		length = b6.xb.length;
																		n73 = 0;
																		while (~b6.xb.length < ~n73) {
																			if (b6.xb[n73] == null) {
																				length = n73;
																			}
																			++n73;
																		}
																		wf.o[n5++] = length;
																	}
																} else if (n4 == 2704 || n4 == 2705) {
																	n5 -= 2;
																	n74 = wf.o[n5];
																	n75 = wf.o[n5 + 1];
																	class_re = (re) rd.J.a((long) n74, n2 ^ 0x3100);
																	if (class_re == null || ~n75 != ~class_re.w) {
																		wf.o[n5++] = 0;
																	} else {
																		wf.o[n5++] = 1;
																	}
																}
															} else {
																b7 = tc.b(wf.o[--n5], -57);
																if (n4 == 2600) {
																	wf.o[n5++] = b7.Gb;
																} else if (n4 == 2601) {
																	wf.o[n5++] = b7.rc;
																} else if (n4 == 2602) {
																	nf.jb[n3++] = b7.ob_lb;
																} else if (n4 == 2603) {
																	wf.o[n5++] = b7.lc;
																} else if (n4 == 2604) {
																	wf.o[n5++] = b7.anInt_cb;
																} else if (n4 == 2605) {
																	wf.o[n5++] = b7.C;
																} else if (n4 == 2606) {
																	wf.o[n5++] = b7.k;
																} else if (n4 == 2607) {
																	wf.o[n5++] = b7.pc;
																} else if (n4 == 2608) {
																	wf.o[n5++] = b7.S;
																} else if (n4 == 2609) {
																	wf.o[n5++] = b7.kb;
																}
															}
														} else {
															ra2 = (boolean_b ? oe.e : gb.eb);
															if (n4 == 1800) {
																wf.o[n5++] = fc.a(ce.a(ra2, n2 - 8061), false);
															} else if (n4 == 1801) {
																n76 = wf.o[--n5];
																--n76;
																if (ra2.Mc == null || ~n76 <= ~ra2.Mc.length || ra2.Mc[n76] == null) {
																	nf.jb[n3++] = nb.ic;
																} else {
																	nf.jb[n3++] = ra2.Mc[n76];
																}
															} else if (n4 == 1802) {
																if (ra2.Mb == null) {
																	nf.jb[n3++] = nb.ic;
																} else {
																	nf.jb[n3++] = ra2.Mb;
																}
															}
														}
													} else {
														ra3 = (boolean_b ? oe.e : gb.eb);
														if (n4 == 1600) {
															wf.o[n5++] = ra3.Gb;
														} else if (n4 == 1601) {
															wf.o[n5++] = ra3.rc;
														} else if (n4 == 1602) {
															nf.jb[n3++] = ra3.ob_lb;
														} else if (n4 == 1603) {
															wf.o[n5++] = ra3.lc;
														} else if (n4 == 1604) {
															wf.o[n5++] = ra3.anInt_cb;
														} else if (n4 == 1605) {
															wf.o[n5++] = ra3.C;
														} else if (n4 == 1606) {
															wf.o[n5++] = ra3.k;
														} else if (n4 == 1607) {
															wf.o[n5++] = ra3.pc;
														} else if (n4 == 1608) {
															wf.o[n5++] = ra3.S;
														} else if (n4 == 1609) {
															wf.o[n5++] = ra3.kb;
														}
													}
												} else {
													ra4 = (boolean_b ? oe.e : gb.eb);
													if (n4 == 1500) {
														wf.o[n5++] = ra4.Nb;
													} else if (n4 == 1501) {
														wf.o[n5++] = ra4.gc;
													} else if (n4 == 1502) {
														wf.o[n5++] = ra4.L;
													} else if (n4 == 1503) {
														wf.o[n5++] = ra4.w;
													} else if (n4 == 1504) {
														wf.o[n5++] = ra4.E ? 1 : 0;
													} else if (n4 == 1505) {
														wf.o[n5++] = ra4.Ic;
													}
												}
											} else {
												if (~n4 <= -2001) {
													n4 -= 1000;
													b8 = tc.b(wf.o[--n5], -53);
												} else {
													b8 = (boolean_b ? oe.e : gb.eb);
												}
												q2 = null;
												a12 = nf.jb[--n3];
												if (~a12.a(false) < -1 && a12.a(n2 - 26060, -1 + a12.a(false)) == 89) {
													n77 = wf.o[--n5];
													if (n77 > 0) {
														q2 = new int[n77];
														while (~(n77--) < -1) {
															q2[n77] = wf.o[--n5];
														}
													} else {
														a12 = a12.a(-1 + a12.a(false), 0, (byte) 62);
													}
												}
												y = new Object[a12.a(false) + 1];
												n78 = -1 + y.length;
												while (n78 >= 1) {
													if (a12.a(n2 ^ 0x6635, -1 + n78) != 115) {
														y[n78] = wf.o[--n5];
													} else {
														y[n78] = nf.jb[--n3];
													}
													--n78;
												}
												n79 = wf.o[--n5];
												if (n79 != -1) {
													y[0] = n79;
												} else {
													y = null;
												}
												if (n4 == 1425) {
													b8.Hc = y;
												} else if (n4 == 1411) {
													b8.s = y;
												} else if (n4 == 1419) {
													b8.D = y;
												} else if (n4 == 1412) {
													b8.xc = y;
												} else if (n4 == 1400) {
													b8.objects_ib = y;
												} else if (n4 == 1415) {
													b8.mb = q2;
													b8.pb = y;
												} else if (n4 == 1422) {
													b8.dc = y;
												} else if (n4 == 1417) {
													b8.Ub = y;
												} else if (n4 == 1418) {
													b8.ub = y;
												} else if (n4 == 1402) {
													b8.Gc = y;
												} else if (n4 == 1421) {
													b8.U = y;
												} else if (n4 == 1407) {
													b8.l = q2;
													b8.vb = y;
												} else if (n4 == 1405) {
													b8.j = y;
												} else if (n4 == 1409) {
													b8.A = y;
												} else if (n4 == 1424) {
													b8.kc = y;
												}
												b8.Vb = true;
												if (n4 == 1414) {
													b8.Q = q2;
													b8.Zb = y;
												} else if (n4 == 1416) {
													b8.Jb = y;
												} else if (n4 == 1423) {
													b8.W = y;
												} else if (n4 == 1408) {
													b8.X = y;
												} else if (n4 == 1406) {
													b8.Db = y;
												} else if (n4 == 1401) {
													b8.G = y;
												} else if (n4 == 1404) {
													b8.F = y;
												} else if (n4 == 1420) {
													b8.objects_cc = y;
												} else if (n4 == 1410) {
													b8.b = y;
												} else if (n4 == 1403) {
													b8.y = y;
												}
											}
										}
										if (~n4 <= -2001) {
											n4 -= 1000;
											b9 = tc.b(wf.o[--n5], n2 - 26293);
										} else {
											b9 = (boolean_b ? oe.e : gb.eb);
										}
										dg.a(b9, -95);
										if (n4 == 1200) {
											n5 -= 2;
											tb = wf.o[n5];
											kc = wf.o[1 + n5];
											if (tb == -1) {
												b9.Tb = -1;
												b9.nb = -1;
												b9.bb = 1;
											} else {
												b9.Kc = kc;
												b9.Tb = tb;
												a13 = jg.a((byte) (-61), tb);
												b9.jb = a13.tb;
												b9.pc = a13.yb;
												b9.S = a13.lb;
												b9.k = a13.wb;
												b9.Nc = a13.N;
												b9.C = a13.L;
												if (b9.L > 0) {
													b9.C = b9.C * 32 / b9.L;
												}
											}
										} else if (n4 == 1201) {
											b9.bb = 2;
											b9.nb = wf.o[--n5];
										} else if (n4 == 1202) {
											b9.bb = 3;
											b9.nb = le.T.Ac.b(24295);
										} else if (n4 == 1203) {
											b9.bb = 6;
											b9.nb = wf.o[--n5];
										} else if (n4 == 1204) {
											b9.bb = 5;
											b9.nb = wf.o[--n5];
										}
									} else {
										if (n4 < 2000) {
											b10 = (boolean_b ? oe.e : gb.eb);
										} else {
											n4 -= 1000;
											b10 = tc.b(wf.o[--n5], -81);
										}
										if (n4 == 1100) {
											n5 -= 2;
											b10.Gb = wf.o[n5];
											if (~b10.Gb < ~(-b10.L + b10.lc)) {
												b10.Gb = -b10.L + b10.lc;
											}
											if (~b10.Gb > -1) {
												b10.Gb = 0;
											}
											b10.rc = wf.o[n5 + 1];
											if (b10.rc > b10.anInt_cb + -b10.w) {
												b10.rc = b10.anInt_cb + -b10.w;
											}
											if (~b10.rc > -1) {
												b10.rc = 0;
											}
											dg.a(b10, n2 ^ 0xFFFF99D7);
										} else if (~n4 == -1102) {
											b10.N = wf.o[--n5];
											dg.a(b10, -86);
										} else if (n4 == 1102) {
											b10.eb = (wf.o[--n5] == 1);
											dg.a(b10, -108);
										} else if (n4 == 1103) {
											b10.kb = wf.o[--n5];
											dg.a(b10, n2 ^ -26130);
										} else if (n4 == 1104) {
											b10.wb = wf.o[--n5];
											dg.a(b10, -112);
										} else if (n4 == 1105) {
											b10.c = wf.o[--n5];
											dg.a(b10, n2 - 26291);
										} else if (n4 == 1106) {
											b10.Y = wf.o[--n5];
											dg.a(b10, -80);
										} else if (n4 == 1107) {
											b10.aBoolean_r = (wf.o[--n5] == 1);
											dg.a(b10, -98);
										} else if (n4 == 1108) {
											b10.bb = 1;
											b10.nb = wf.o[--n5];
											dg.a(b10, -96);
										} else if (n4 == 1109) {
											n5 -= 6;
											b10.jb = wf.o[n5];
											b10.Nc = wf.o[n5 + 1];
											b10.k = wf.o[2 + n5];
											b10.S = wf.o[3 + n5];
											b10.pc = wf.o[4 + n5];
											b10.C = wf.o[n5 + 5];
											dg.a(b10, -107);
										} else if (n4 == 1110) {
											nc = wf.o[--n5];
											if (~b10.nc != ~nc) {
												b10.Oc = 0;
												b10.Fb = 0;
												b10.nc = nc;
												dg.a(b10, -121);
											}
										} else if (n4 == 1111) {
											b10.h = (wf.o[--n5] == 1);
											dg.a(b10, n2 ^ 0xFFFF99DB);
										} else if (n4 == 1112) {
											ob_lb = nf.jb[--n3];
											if (!ob_lb.a((byte) 63, b10.ob_lb)) {
												b10.ob_lb = ob_lb;
												dg.a(b10, -110);
											}
										} else if (n4 == 1113) {
											b10.yc = wf.o[--n5];
											dg.a(b10, -121);
										} else if (n4 == 1114) {
											n5 -= 3;
											b10.J = wf.o[n5];
											b10.yb = wf.o[n5 + 1];
											b10.anInt_e = wf.o[2 + n5];
											dg.a(b10, -123);
										} else if (n4 == 1115) {
											b10.a = (wf.o[--n5] == 1);
											dg.a(b10, -83);
										} else if (n4 == 1116) {
											b10.ac = wf.o[--n5];
											dg.a(b10, -103);
										} else if (n4 == 1117) {
											b10.q = wf.o[--n5];
											dg.a(b10, -105);
										} else if (n4 == 1118) {
											b10.P = wf.o[--n5] == 1;
											dg.a(b10, -96);
										} else if (n4 == 1119) {
											b10.Bc = wf.o[--n5] == 1;
											dg.a(b10, -84);
										} else if (n4 == 1120) {
											n5 -= 2;
											b10.lc = wf.o[n5];
											b10.anInt_cb = wf.o[n5 + 1];
											dg.a(b10, -105);
										}
									}
								} else {
									if (~n4 <= -2001) {
										n4 -= 1000;
										b11 = tc.b(wf.o[--n5], -79);
									} else {
										b11 = (boolean_b ? oe.e : gb.eb);
									}
									if (n4 == 1000) {
										n5 -= 2;
										b11.Nb = wf.o[n5];
										b11.gc = wf.o[1 + n5];
										dg.a(b11, -104);
									} else if (n4 == 1001) {
										n5 -= 2;
										b11.L = wf.o[n5];
										b11.w = wf.o[1 + n5];
										dg.a(b11, -108);
									} else if (n4 == 1003) {
										e = (~wf.o[--n5] == -2);
										if (e != b11.E) {
											b11.E = e;
											dg.a(b11, -126);
										}
									}
								}
							} else {
								if (n4 == 100) {
									n5 -= 3;
									n80 = wf.o[n5];
									anInt_ac = wf.o[n5 + 1];
									rb = wf.o[2 + n5];
									if (anInt_ac == 0) {
										throw new RuntimeException();
									}
									b12 = tc.b(n80, -61);
									if (b12.xb == null) {
										b12.xb = new ra[rb + 1];
									}
									if (~b12.xb.length >= ~rb) {
										xb = new ra[rb + 1];
										n81 = 0;
										while (n81 < b12.xb.length) {
											xb[n81] = b12.xb[n81];
											++n81;
										}
										b12.xb = xb;
									}
									if (~rb < -1 && b12.xb[-1 + rb] == null) {
										throw new RuntimeException("Gap at:" + (rb - 1));
									}
									ra5 = new ra();
									ra5.R = true;
									ra5.Rb = rb;
									ra5.Ac = anInt_ac;
									ra6 = ra5;
									ra7 = ra5;
									ec = b12.Ec;
									ra7.Ec = ec;
									ra6.Ic = ec;
									b12.xb[rb] = ra5;
									if (boolean_b) {
										oe.e = ra5;
									} else {
										gb.eb = ra5;
									}
									dg.a(b12, -83);
								} else if (n4 == 101) {
									ra8 = (boolean_b ? oe.e : gb.eb);
									if (~ra8.Rb == 0) {
										if (!boolean_b) {
											throw new RuntimeException("Tried to cc_delete static active-component!");
										} else {
											throw new RuntimeException("Tried to .cc_delete static .active-component!");
										}
									} else {
										b13 = tc.b(ra8.Ec, -47);
										b13.xb[ra8.Rb] = null;
										dg.a(b13, n2 - 26303);
									}
								} else if (n4 == 102) {
									b14 = tc.b(wf.o[--n5], n2 ^ 0xFFFF99F9);
									b14.xb = null;
									dg.a(b14, n2 - 26280);
								} else if (n4 == 200) {
									n5 -= 2;
									n82 = wf.o[1 + n5];
									a14 = ue.a(n82, (byte) 56, wf.o[n5]);
									if (a14 == null || n82 == -1) {
										wf.o[n5++] = 0;
									} else {
										wf.o[n5++] = 1;
										if (!boolean_b) {
											gb.eb = a14;
										} else {
											oe.e = a14;
										}
									}
								} else if (n4 == 201) {
									b15 = tc.b(wf.o[--n5], -84);
									if (b15 == null) {
										wf.o[n5++] = 0;
									} else {
										wf.o[n5++] = 1;
										if (!boolean_b) {
											gb.eb = b15;
										} else {
											oe.e = b15;
										}
									}
								}
							}
						}
					}
				}
			} catch (Exception ex) {
				System.err.println("k.E: " + k.E);
				if (k.E == null) {
					if (qa.l != 0) {
						nb.a(0, (byte) (-112), nb.ic, cf.clientscriptErrorCheckLogForDetails);
					}
					ra.a("[Error1] CS2 - scr:" + k.clientScriptId + " op:" + n4, ex, (byte) 118);
				} else {
					final ob a15 = vb.a(30, 256);
					a15.a(ag.f, (byte) 34).a(k.E, (byte) 34);
					int n83 = -1 + mg.f;
					while (~n83 <= -1) {
						a15.a(wf.i, (byte) 34).a(sb.ab[n83].k.E, (byte) 34);
						--n83;
					}
					if (n4 == 40) {
						a15.a(ph.u, (byte) 34).a(hh.a((byte) 93, array2[a]), (byte) 34);
					}
					if (qa.l != 0) {
						nb.a(0, (byte) (-126), nb.ic, wc.a(new ob[] {mi.clientscriptErrorIn, k.E}, -3));
					}
					ra.a("[Error2] CS2 - scr:" + k.clientScriptId + " op:" + n4 + new String(a15.getBytes(-35)), ex, (byte) (-120));
				}
			}
		} catch (RuntimeException ex2) {
			throw bc.a(ex2, "ve.F(" + ((class_wc != null) ? "{...}" : "null") + ',' + anInt_n + ',' + n2 + ')');
		}

	}

	static void b (int unused) {
		try {
			++m;
			int count = 0;
			if (~qf.I < ~count) {
				do {
					int inScreenId = mf.nb[count];
					dg class_dg = lg.j[inScreenId];
					int mask = pg.packetBuffer.readUnsignedByte(255);
					if ((mask & 0x1) != 0) {
						mask += pg.packetBuffer.readUnsignedByte(255) << 8;
					}

					mg.a(mask, class_dg, inScreenId, true);
					++count;
				} while (~qf.I < ~count);

			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "ve.B(" + unused + ')');
		}
	}

	@Contract(pure = true)
	static boolean a (int var0, int var1, int var2) {
		for (int var3 = 0; var3 < wh.f; ++var3) {
			ih var4 = ah.t[var3];
			int var6;
			int var7;
			int var8;
			int var9;
			if (var4.z == 1) {
				int i = var4.c - var0;
				if (i > 0) {
					int i1 = var4.b + (var4.A * i >> 8);
					var7 = var4.w + (var4.n * i >> 8);
					var8 = var4.a + (var4.s * i >> 8);
					var9 = var4.F + (var4.C * i >> 8);
					if (var2 >= i1 && var2 <= var7 && var1 >= var8 && var1 <= var9) {
						return true;
					}
				}
			} else if (var4.z == 2) {
				int i = var0 - var4.c;
				if (i > 0) {
					var6 = var4.b + (var4.A * i >> 8);
					var7 = var4.w + (var4.n * i >> 8);
					var8 = var4.a + (var4.s * i >> 8);
					var9 = var4.F + (var4.C * i >> 8);
					if (var2 >= var6 && var2 <= var7 && var1 >= var8 && var1 <= var9) {
						return true;
					}
				}
			} else if (var4.z == 3) {
				int i = var4.b - var2;
				if (i > 0) {
					int i1 = var4.c + (var4.i * i >> 8);
					var7 = var4.k + (var4.y * i >> 8);
					var8 = var4.a + (var4.s * i >> 8);
					var9 = var4.F + (var4.C * i >> 8);
					if (var0 >= i1 && var0 <= var7 && var1 >= var8 && var1 <= var9) {
						return true;
					}
				}
			} else if (var4.z == 4) {
				int i = var2 - var4.b;
				if (i > 0) {
					var6 = var4.c + (var4.i * i >> 8);
					var7 = var4.k + (var4.y * i >> 8);
					var8 = var4.a + (var4.s * i >> 8);
					var9 = var4.F + (var4.C * i >> 8);
					if (var0 >= var6 && var0 <= var7 && var1 >= var8 && var1 <= var9) {
						return true;
					}
				}
			} else if (var4.z == 5) {
				int i = var1 - var4.a;
				if (i > 0) {
					var6 = var4.c + (var4.i * i >> 8);
					var7 = var4.k + (var4.y * i >> 8);
					var8 = var4.b + (var4.A * i >> 8);
					var9 = var4.w + (var4.n * i >> 8);
					if (var0 >= var6 && var0 <= var7 && var2 >= var8 && var2 <= var9) {
						return true;
					}
				}
			}
		}

		return false;
	}

	ve (int var1, int var2, int var3) {
		try {
			this.anInt_n = var2;
			this.k = var1;
			this.s = new int[this.k][3][var3];
			this.c = new hb[this.anInt_n];
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ve.<init>(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
}
