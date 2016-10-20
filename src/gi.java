import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class gi extends rh {
	
	static int anInt_v;
	static int w;
	static vc x = new vc(30);
	static t y;
	static ob z = rf.a(40, "auf einer freien Welt zu spielen)3");
	static int A;
	static int B;
	static int C;
	static ca cacheFile_2;
	static ob goBackToTheMainRuneScapeWebpage2;
	static boolean[] F;
	private static ob goBackToTheMainRuneScapeWebpage = rf.a(40, "go back to the main RuneScape webpage");
	
	static void a(byte paramByte, int paramInt, ae paramae) {
		int i4 = client.anInt_wb;
		try {
			if (paramByte != -69) {
				return;
			}
			A += 1;
			for (; ; ) {
				wa localwa = (wa) eh.T.a((byte) -9);
				if (localwa == null) {
					return;
				}
				int i = 0;
				int j = 0;
				if (i4 != 0) {
				}
				while ((~localwa.q) < (~j)) {
					if (localwa.u[j] != null) {
						if (localwa.u[j].d == 2) {
							localwa.y[j] = -5;
						}
						if ((~localwa.u[j].d) == -1) {
							i = 1;
						}
					}
					if (localwa.B[j] != null) {
						if (localwa.B[j].d == 2) {
							localwa.y[j] = -6;
						}
						if ((~localwa.B[j].d) == -1) {
							i = 1;
						}
					}
					j++;
				}
				if (i != 0) {
					return;
				}
				paramae.p(paramInt, 12885);
				paramae.writeByte(78, 0);
				int k = paramae.pointer;
				paramae.b(localwa.z, (byte) 90);
				int m = 0;
				if (i4 != 0) {
				}
				while (localwa.q > m) {
					if (localwa.y[m] != 0) {
						paramae.writeByte(paramByte ^ 0xFFFFFFF0, localwa.y[m]);
						if (i4 == 0) {
						}
					} else {
						try {
							int n = localwa.x[m];
							Object localObject1;
							int i1;
							if (n == 0) {
								localObject1 = (Field) localwa.u[m].e;
								i1 = ((Field) localObject1).getInt(null);
								paramae.writeByte(paramByte + 170, 0);
								paramae.b(i1, (byte) -119);
								if (i4 == 0) {
								}
							} else if (n != 1) {
								if ((~n) == -3) {
									localObject1 = (Field) localwa.u[m].e;
									i1 = ((Field) localObject1).getModifiers();
									paramae.writeByte(127, 0);
									paramae.b(i1, (byte) -125);
									if (i4 == 0) {
									}
								}
							} else {
								localObject1 = (Field) localwa.u[m].e;
								((Field) localObject1).setInt(null, localwa.o[m]);
								paramae.writeByte(paramByte ^ 0xFFFFFFC7, 0);
							}
							if ((~n) == -4) {
								byte[][] arrayOfByte = localwa.r[m];
								localObject1 = (Method) localwa.B[m].e;
								Object[] arrayOfObject = new Object[arrayOfByte.length];
								int i3 = 0;
								if (i4 != 0) {
								}
								while (i3 < arrayOfByte.length) {
									Object localObject2 = new ObjectInputStream(new ByteArrayInputStream(arrayOfByte[i3]));
									arrayOfObject[i3] = ((ObjectInputStream) localObject2).readObject();
									i3++;
								}
								Object localObject2 = ((Method) localObject1).invoke(null, arrayOfObject);
								if (localObject2 == null) {
									paramae.writeByte(94, 0);
									if (i4 == 0) {
									}
								} else if (!(localObject2 instanceof Number)) {
									if (!(localObject2 instanceof ob)) {
										paramae.writeByte(95, 4);
										if (i4 == 0) {
										}
									} else {
										paramae.writeByte(87, 2);
										paramae.writeString((ob) localObject2, (byte) -95);
										if (i4 == 0) {
										}
									}
								} else {
									paramae.writeByte(paramByte ^ 0xFFFFFFE6, 1);
									paramae.writeLong(-127, ((Number) localObject2).longValue());
									if (i4 == 0) {
									}
								}
							} else if ((~n) == -5) {
								localObject1 = (Method) localwa.B[m].e;
								int i2 = ((Method) localObject1).getModifiers();
								paramae.writeByte(paramByte ^ 0xFFFFFFCD, 0);
								paramae.b(i2, (byte) 65408);
							}
						} catch (ClassNotFoundException localClassNotFoundException) {
							paramae.writeByte(111, -10);
						} catch (InvalidClassException localInvalidClassException) {
							paramae.writeByte(125, -11);
						} catch (StreamCorruptedException localStreamCorruptedException) {
							paramae.writeByte(95, -12);
						} catch (OptionalDataException localOptionalDataException) {
							paramae.writeByte(paramByte ^ 0xFFFFFFC5, -13);
						} catch (IllegalAccessException localIllegalAccessException) {
							paramae.writeByte(paramByte + 150, -14);
						} catch (IllegalArgumentException localIllegalArgumentException) {
							paramae.writeByte(69, -15);
						} catch (InvocationTargetException localInvocationTargetException) {
							paramae.writeByte(111, -16);
						} catch (SecurityException localSecurityException) {
							paramae.writeByte(122, -17);
						} catch (IOException localIOException) {
							paramae.writeByte(70, -18);
						} catch (NullPointerException localNullPointerException) {
							paramae.writeByte(100, -19);
						} catch (Exception localException) {
							paramae.writeByte(paramByte + 138, -20);
						} catch (Throwable localThrowable) {
							paramae.writeByte(74, -21);
						}
					}
					m++;
				}
				paramae.h(k, 48);
				paramae.c(paramae.pointer + -k, (byte) 17);
				localwa.c(128);
			}
		} catch (RuntimeException localRuntimeException) {
			throw bc.a(localRuntimeException, "gi.J(" + paramByte + ',' + paramInt + ',' + (paramae != null ? "{...}" : "null") + ')');
		}
		
	}
	
	static void a(byte unused, na class_na) {
		int dummy = client.anInt_wb;
		try {
			C += 1;
			if (ih.v) {
				ef.a(class_na, 28 ^ 0x1F);
				return;
			}
			if (((~qe.k) == -2) && (ia.eb >= 715) && ((~tf.m) <= 65082)) {
				ni.S = !ni.S;
				if (!ni.S) {
					ac.a(false, fc.scapeMainValue, true, q.cacheFile_6, 0, 255);
				} else {
					sh.b(100);
				}
			}
			if ((~qb.gameState) == -6) {
				return;
			}
			ld.u += 1;
			if (qb.gameState != 10) {
				return;
			}
			int n;
			int m;
			int i1;
			if (oc.g != 2 && oh.M == 0) {
				if (qe.k == 1) {
					int i = 5;
					int j = 463;
					m = 35;
					k = 100;
					if ((i <= ia.eb) && (ia.eb <= k + i) && ((~tf.m) <= (~j)) && (tf.m <= j - -m)) {
						l.a(39997);
						return;
					}
				}
				if (c.Y != null) {
					l.a(39997);
				}
			}
			int i = qe.k;
			int j = ia.eb;
			int k = tf.m;
			if (g.J != 0) {
				if (g.J != 2) {
					if (g.J == 3) {
						n = 321;
						m = 382;
						if (i == 1 && ~j <= ~-75 - m && 75 + m >= j && -20 + n <= k && ~n - 20 <= ~k) {
							g.J = 0;
						}
					}
				} else {
					m = 231;
					m += 30;
					i1 = 321;
					if ((i == 1) && (m - 15 <= k) && (k < m)) {
						vg.eb = 0;
					}
					n = 302;
					m += 15;
					if ((i == 1) && ((~-15 + m) >= (~k)) && ((~m) < (~k))) {
						vg.eb = 1;
					}
					m += 15;
					if (((~i) == -2) && (j >= n + -75) && (j <= n + 75) && ((~k) <= (~-20 + i1)) && (k <= 20 + i1)) {
						kf.l = kf.l.f((byte) 34).a(45);
						if ((~kf.l.a(false)) == -1) {
							c.a(v.G, v.kb, ld.s, (byte) -70);
							return;
						}
						if (kf.f.a(false) == 0) {
							c.a(v.db, v.Y, ga.l, (byte) -70);
							return;
						}
						c.a(v.ab, v.bb, qg.d, (byte) -70);
						pg.setGameState(20, (byte) -67);
						return;
					}
					n = 462;
					if (i == 1 && ~n + 75 >= ~j && n + 75 >= j && (i1 - 20 <= k) && (k <= 20 + i1)) {
						g.J = 0;
						kf.f = kf.e;
						kf.l = kf.e;
					}
					while (q.j(1)) {
						int i2 = 0;
						int i3 = 0;
						while (i3 < nf.nb.a(false)) {
							if (s.X == nf.nb.a(126, i3)) {
								i2 = 1;
								if (dummy == 0) {
									break;
								}
							}
							i3++;
						}
						if ((~vg.eb) != -1) {
							if ((~vg.eb) == -2) {
								if (((~ia.fb) == -86) && ((~kf.f.a(false)) < -1)) {
									kf.f = kf.f.a(-1 + kf.f.a(false), 0, (byte) 74);
								}
								if (((~ia.fb) == -85) || ((~ia.fb) == -81)) {
									vg.eb = 0;
								}
								if ((qa.l != 0) && (ia.fb == 84)) {
									kf.l = kf.l.f((byte) 34).a(88);
									if (kf.l.a(false) == 0) {
										c.a(v.G, v.kb, ld.s, (byte) -70);
										return;
									}
									if (kf.f.a(false) == 0) {
										c.a(v.db, v.Y, ga.l, (byte) -70);
										return;
									}
									c.a(v.ab, v.bb, qg.d, (byte) -70);
									pg.setGameState(20, (byte) 112);
									return;
								}
								if ((i2 != 0) && (kf.f.a(false) < 20)) {
									kf.f = kf.f.c(s.X, 28 ^ 0xFFFFFF99);
								}
							}
						} else {
							if (((~ia.fb) == -86) && ((~kf.l.a(false)) < -1)) {
								kf.l = kf.l.a(-1 + kf.l.a(false), 0, (byte) 57);
							}
							if ((ia.fb == 84) || (ia.fb == 80)) {
								vg.eb = 1;
							}
							if ((i2 != 0) && (kf.l.a(false) < 12)) {
								kf.l = kf.l.c(s.X, -94);
							}
						}
					}
				}
				return;
			}
			n = 291;
			m = 302;
			if (i == 1 && -75 + m <= j && j <= m + 75 && ~k <= ~n + /*-*/20 && k >= ~20 + n) {
				g.J = 3;
				vg.eb = 0;
			}
			m = 462;
			i1 = 0;
			if (qa.l != 0) {
				while (q.j(1)) {
					if ((~ia.fb) == -85) {
						i1 = 1;
						if (dummy == 0) {
							break;
						}
					}
				}
			}
			if (i1 != 0 || i == 1 && ~m + 75 >= ~j && j <= m + 75 && k >= -20 + n && ~n - 20 <= ~k) {
				kf.i = sh.enterYourUsernamePassword2;
				vg.eb = 0;
				kf.j = v.T;
				kf.ob_d = v.lb;
				g.J = 2;
			}
		} catch (RuntimeException e) {
			throw bc.a(e, "gi.K(" + unused + ',' + (class_na != null ? "{...}" : "null") + ')');
		}
	}
	
	static void a(byte var0, int var1) {
		int var5 = client.anInt_wb;
		
		try {
			na.c((byte) -50);
			++anInt_v;
			ka.e((byte) -65);
			int var2 = qd.a(false, var1).H;
			if (var0 < -71) {
				if (~var2 != -1) {
					int var3 = sa.c[var1];
					if (var2 == 1) {
						wd.e = var3;
						if (~wd.e == -2) {
							ec.a(0.9F);
						}
						
						if (wd.e == 2) {
							ec.a(0.8F);
						}
						
						if (~wd.e == -4) {
							ec.a(0.7F);
						}
						
						if (~wd.e == -5) {
							ec.a(0.6F);
						}
						
						ga.b(255);
					}
					
					if (~var2 == -4) {
						short var4 = 0;
						if (var3 == 0) {
							var4 = 255;
						}
						
						if (~var3 == -2) {
							var4 = 192;
						}
						
						if (var3 == 2) {
							var4 = 128;
						}
						
						if (var3 == 3) {
							var4 = 64;
						}
						
						if (var3 == 4) {
							var4 = 0;
						}
						
						if (~bc.mb != ~var4) {
							label148:
							{
								if (~bc.mb != -1 || ~sc.g == 0) {
									if (~var4 != -1) {
										ad.c(0, var4);
										if (var5 == 0) {
											break label148;
										}
									}
									
									sh.b(-114);
									li.aBoolean_q = false;
									if (var5 == 0) {
										break label148;
									}
								}
								
								ac.a(false, sc.g, true, q.cacheFile_6, 0, var4);
								li.aBoolean_q = false;
							}
							
							bc.mb = var4;
						}
					}
					
					if (var2 == 4) {
						if (~var3 == -1) {
							ci.z = 127;
						}
						
						if (var3 == 1) {
							ci.z = 96;
						}
						
						if (~var3 == -3) {
							ci.z = 64;
						}
						
						if (var3 == 3) {
							ci.z = 32;
						}
						
						if (var3 == 4) {
							ci.z = 0;
						}
					}
					
					if (var2 == 10) {
						if (var3 == 0) {
							qf.L = 127;
						}
						
						if (~var3 == -2) {
							qf.L = 96;
						}
						
						if (var3 == 2) {
							qf.L = 64;
						}
						
						if (var3 == 3) {
							qf.L = 32;
						}
						
						if (var3 == 4) {
							qf.L = 0;
						}
					}
					
					if (~var2 == -7) {
						je.Z = var3;
					}
					
					if (var2 == 9) {
						ri.a = var3;
					}
					
					if (~var2 == -6) {
						og.db = var3;
					}
				}
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "gi.C(" + var0 + ',' + var1 + ')');
		}
	}
	
	public static void b(byte var0) {
		try {
			goBackToTheMainRuneScapeWebpage = null;
			if (var0 > -74) {
				b((byte) 3);
			}
			
			goBackToTheMainRuneScapeWebpage2 = null;
			F = null;
			y = null;
			z = null;
			x = null;
			cacheFile_2 = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "gi.D(" + var0 + ')');
		}
	}
	
	static i loadFont(ob class_ob, int unused, pe cacheFile13, pe cacheFile8, ob class_ob2) {
		try {
			++B;
			int i = cacheFile8.a((byte) -115, class_ob);
			int i1 = cacheFile8.a(i, true, class_ob2);
			return wc.a(cacheFile8, cacheFile13, i, -102, i1);
		} catch (RuntimeException e) {
			throw bc.a(e, "gi.E(" + (class_ob != null ? "{...}" : "null") + ',' + unused
					+ ',' + (cacheFile13 != null ? "{...}" : "null") + ',' + (cacheFile8 != null ? "{...}" : "null")
					+ ',' + (class_ob2 != null ? "{...}" : "null") + ')');
		}
	}
	
	static {
		goBackToTheMainRuneScapeWebpage2 = goBackToTheMainRuneScapeWebpage;
	}
}
