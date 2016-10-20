final class ce extends rg {
	
	static ob D = rf.a(40, "<col=80ff00>");
	static int E;
	static int F = 0;
	int G = 5;
	static int I;
	int J = -1;
	static int L;
	int M = -1;
	static int N;
	static int O;
	private int[] P;
	static int Q;
	static short[][] R = new short[][] {{(short) 6554, (short) 115, (short) 10304, (short) 28, (short) 5702, (short) 7756, (short) 5681, (short) 4510, (short) -31835, (short) 22437, (short) 2859, (short) -11339, (short) 16, (short) 5157, (short) 10446, (short) 3658, (short) -27314, (short) -21965, (short) 472, (short) 580, (short) 784, (short) 21966, (short) 28950, (short) -15697, (short) -14002}, {(short) 9104, (short) 10275, (short) 7595, (short) 3610, (short) 7975, (short) 8526, (short) 918, (short) -26734, (short) 24466, (short) 10145, (short) -6882, (short) 5027, (short) 1457, (short) 16565, (short) -30545, (short) 25486, (short) 24, (short) 5392, (short) 10429, (short) 3673, (short) -27335, (short) -21957, (short) 192, (short) 687, (short) 412, (short) 21821, (short) 28835, (short) -15460, (short) -14019}, new short[0], new short[0], new short[0]};
	int[] S;
	int T = 2;
	int U = -1;
	int V = -1;
	int[] W;
	static int X;
	int Y = -1;
	int[] Z;
	static int ab;
	static ob bb = rf.a(40, "");
	boolean cb = false;
	static int db;
	int eb = 99;
	static int fb;
	private int[] gb;
	static int hb = 0;
	
	final void a(int unused, og og) {
		int dummy = client.anInt_wb;
		
		try {
			if (unused != 0) {
				this.cb = true;
			}
			
			do {
				int value = og.readUnsignedByte(255);
				if (value == 0) {
					break;
				}
				
				this.a(og, value, -68);
			} while (dummy == 0);
			
			++X;
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ce.B(" + unused + ',' + (og != null ? "{...}" : "null") + ')');
		}
	}
	
	static int a(ra ra, int unused) {
		try {
			++L;
			la la = (la) tf.e.a((long) ra.Rb + ((long) ra.Ec << 32), 22346);
			return la != null ? la.q : ra.v;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ce.E(" + "{...}" + ',' + unused + ')');
		}
	}
	
	final fe a(int i, byte unused, int i1, fe fe) {
		int dummy = client.anInt_wb;
		
		try {
			++db;
			i1 = this.Z[i1];
			hh hh = pc.a(0, i1 >> 16);
			i1 &= '\uffff';
			if (hh == null) {
				return fe.a(true);
			} else {
				fe fe1;
				i &= 3;
				fe1 = fe.a(!hh.b(-30419, i1));
				if (i == 1) {
					fe1.c();
				} else if (i == 2) {
					fe1.e();
				} else if (i == 3) {
					fe1.d();
				}
				
				fe1.a(hh, i1);
				if (i == 1) {
					fe1.d();
				} else if (i != 2) {
					if (i != 3) {
						return fe1;
					}
					
					fe1.c();
				}
				
				fe1.e();
				return fe1;
			}
		} catch (RuntimeException var9) {
			throw bc.a(var9, "ce.K(" + i + ',' + unused + ',' + i1 + ',' + (fe != null ? "{...}" : "null") + ')');
		}
	}
	
	static int b(int i, int i1) {
		i1 = i1 * (i & 127) >> 7;
		if (i1 < 2) {
			i1 = 2;
		} else if (i1 > 126) {
			i1 = 126;
		}
		
		return (i & 'ﾀ') + i1;
	}
	
	final void f(int unused) {
		try {
			if (this.V == -1) {
				if (this.gb == null) {
					this.V = 0;
				} else {
					this.V = 2;
				}
			}
			
			++fb;
			if (this.Y == -1) {
				if (this.gb == null) {
					this.Y = 0;
				} else {
					this.Y = 2;
				}
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "ce.C(" + unused + ')');
		}
	}
	
	static void a(int unused, i class_i, i class_i_2) {
		int dummy = client.anInt_wb;
		
		try {
			++Q;
			if (ff.kb == null) {
				ff.kb = ie.a(fc.sl_backValue, 36, 0, l.cacheFile_8);
			}
			
			if (ic.ab == null) {
				ic.ab = pa.a(oc.sl_flagsValue, l.cacheFile_8, 0, 865);
			}
			
			if (ef.ab == null) {
				ef.ab = pa.a(wa.sl_arrowsValue, l.cacheFile_8, 0, 865);
			}
			
			if (jc.U == null) {
				jc.U = pa.a(mi.sl_starsValue, l.cacheFile_8, 0, 865);
			}
			
			oi.d(0, 23, 765, 480, 0);
			oi.d(0, 0, 125, 23, 12425273, 9135624);
			oi.d(125, 0, 640, 23, 5197647, 2697513);
			class_i_2.b(hf.B, 62, 15, 0, -1);
			if (jc.U != null) {
				jc.U[1].b(140, 1);
				class_i.a(hi.f, 152, 10, 16777215, -1);
				jc.U[0].b(140, 12);
				class_i.a(qc.C, 152, 21, 16777215, -1);
			}
			
			if (ef.ab != null) {
				short s;
				short s2;
				short s3;
				s = 280;
				s2 = 390;
				s3 = 610;
				if (~ef.gb[0] == -1 && cc.D[0] == 0) {
					ef.ab[2].b(s, 4);
				} else {
					ef.ab[0].b(s, 4);
				}
				
				if (~ef.gb[0] != -1 || cc.D[0] != 1) {
					ef.ab[1].b(15 + s, 4);
				} else {
					ef.ab[3].b(s - -15, 4);
				}
				
				short s4;
				class_i_2.a(fi.w, s + 32, 17, 16777215, -1);
				s4 = 500;
				if (~ef.gb[0] != -2 || ~cc.D[0] != -1) {
					ef.ab[0].b(s2, 4);
				} else {
					ef.ab[2].b(s2, 4);
				}
				
				if (ef.gb[0] != 1 || cc.D[0] != 1) {
					ef.ab[1].b(15 + s2, 4);
				} else {
					ef.ab[3].b(s2 + 15, 4);
				}
				
				class_i_2.a(wf.d, s2 - -32, 17, 16777215, -1);
				if (ef.gb[0] == 2 && cc.D[0] == 0) {
					ef.ab[2].b(s4, 4);
				} else {
					ef.ab[0].b(s4, 4);
				}
				
				if (~ef.gb[0] != -3 || cc.D[0] != 1) {
					ef.ab[1].b(15 + s4, 4);
				} else {
					ef.ab[3].b(15 + s4, 4);
				}
				
				class_i_2.a(se.a, s4 - -32, 17, 16777215, -1);
				if (~ef.gb[0] == -4 && ~cc.D[0] == -1) {
					ef.ab[2].b(s3, 4);
				} else {
					ef.ab[0].b(s3, 4);
				}
				
				if (~ef.gb[0] != -4 || cc.D[0] != 1) {
					ef.ab[1].b(s3 - -15, 4);
				} else {
					ef.ab[3].b(15 + s3, 4);
				}
				
				class_i_2.a(mg.d, s3 + 32, 17, 16777215, -1);
			}
			
			oi.d(708, 4, 50, 16, 0);
			class_i.b(ea.cancel2, 733, 16, 16777215, -1);
			nc.i = -1;
			if (ff.kb != null) {
				byte b = 88;
				byte b1 = 19;
				int i1 = 765 / (1 + b);
				int i2 = 480 / (b1 - -1);
				int i3;
				int i4;
				do {
					i3 = i2;
					i4 = i1;
					if (i2 * (-1 + i1) >= dd.j) {
						--i1;
					}
					
					if (dd.j <= i1 * (i2 - 1)) {
						--i2;
					}
					
					if (i1 * (-1 + i2) >= dd.j) {
						--i2;
					}
				} while (~i3 != ~i2 || ~i1 != ~i4);
				
				i3 = (-(i1 * b) + 765) / (1 + i1);
				if (~i3 < -6) {
					i3 = 5;
				}
				
				int i5 = (-((i1 + -1) * i3) + 765 + -(i1 * b)) / 2;
				i4 = (480 - i2 * b1) / (i2 - -1);
				if (~i4 < -6) {
					i4 = 5;
				}
				
				int i6 = (-((i2 - 1) * i4) + -(b1 * i2) + 480) / 2;
				int i7 = i5;
				int i8 = i6 + 23;
				int i9 = 0;
				int i10 = 0;
				if (/*dummy != 0 || */~dd.j < ~i10) {
					do {
						cd cd;
						boolean flag;
						ob ob;
						flag = true;
						cd = ea.ab[i10];
						ob = hh.a((byte) 93, cd.e);
						if (~cd.e == 0) {
							flag = false;
							ob = client.ob_hb;
						}
						
						if (~cd.e < -1981) {
							ob = qb.M;
							flag = false;
						}
						
						if (og.o >= i7 && ~re.u <= ~i8 && og.o < i7 - -b && ~re.u > ~(b1 + i8) && flag) {
							nc.i = i10;
							ff.kb[cd.d ? 1 : 0].h(i7, i8, 128, 16777215);
						} else {
							ff.kb[!cd.d ? 0 : 1].b(i7, i8);
						}
						
						if (ic.ab != null) {
							ic.ab[cd.i + (!cd.d ? 0 : 8)].b(i7 - -29, i8);
						}
						
						class_i_2.b(hh.a((byte) 93, cd.k), i7 + 15, 5 + i8 + b1 / 2, 0, -1);
						class_i.b(ob, 60 + i7, 5 + (i8 - -(b1 / 2)), 268435455, -1);
						i8 += i4 + b1;
						++i9;
						if (i9 >= i2) {
							i8 = i6 + 23;
							i7 += b + i3;
							i9 = 0;
						}
						
						++i10;
					} while (~dd.j < ~i10);
				}
			}
		} catch (RuntimeException var20) {
			throw bc.a(var20, "ce.F(" + unused + ',' + (class_i != null ? "{...}" : "null") + ',' + (class_i_2 != null ? "{...}" : "null") + ')');
		}
	}
	
	public static void g(int unused) {
		try {
			R = null;
			bb = null;
			D = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ce.A(" + unused + ')');
		}
	}
	
	final fe a(fe fe, byte unused, int i) {
		try {
			i = this.Z[i];
			++E;
			hh hh = pc.a(0, i >> 16);
			i &= '\uffff';
			if (hh == null) {
				return fe.b(true);
			} else {
				fe fe1 = fe.b(!hh.b(-30419, i));
				fe1.a(hh, i);
				return fe1;
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "ce.L(" + (fe != null ? "{...}" : "null") + ',' + unused + ',' + i + ')');
		}
	}
	
	private void a(og og, int value, int var3) {
		int var8 = client.anInt_wb;
		
		try {
			int var4;
			label191:
			{
				int var5;
				int var6;
				if (value != 1) {
					if (~value != -3) {
						if (~value == -4) {
							var4 = og.readUnsignedByte(255);
							this.gb = new int[1 + var4];
							var5 = 0;
							if (var8 != 0 || ~var4 < ~var5) {
								do {
									this.gb[var5] = og.readUnsignedByte(255);
									++var5;
								} while (~var4 < ~var5);
							}
							
							this.gb[var4] = 9999999;
							if (var8 == 0) {
								break label191;
							}
						}
						
						if (~value == -5) {
							this.cb = true;
							if (var8 == 0) {
								break label191;
							}
						}
						
						if (value == 5) {
							this.G = og.readUnsignedByte(255);
							if (var8 == 0) {
								break label191;
							}
						}
						
						if (value != 6) {
							if (value == 7) {
								this.M = og.readShort(84);
								if (var8 == 0) {
									break label191;
								}
							}
							
							if (value == 8) {
								this.eb = og.readUnsignedByte(255);
								if (var8 == 0) {
									break label191;
								}
							}
							
							if (~value == -10) {
								this.V = og.readUnsignedByte(255);
								if (var8 == 0) {
									break label191;
								}
							}
							
							if (value == 10) {
								this.Y = og.readUnsignedByte(255);
								if (var8 == 0) {
									break label191;
								}
							}
							
							if (value == 11) {
								this.T = og.readUnsignedByte(255);
								if (var8 == 0) {
									break label191;
								}
							}
							
							if (~value != -13) {
								if (~value != -14) {
									break label191;
								}
								
								var4 = og.readUnsignedByte(255);
								this.S = new int[var4];
								var5 = 0;
								if (var8 == 0 && var5 >= var4) {
									if (var8 == 0) {
										break label191;
									}
								} else {
									while (true) {
										this.S[var5] = og.readUnsignedMedInt(71);
										++var5;
										if (var5 >= var4) {
											if (var8 == 0) {
												break label191;
											}
											break;
										}
									}
								}
							}
							
							var4 = og.readUnsignedByte(255);
							this.P = new int[var4];
							var5 = 0;
							if (var8 != 0 || ~var4 < ~var5) {
								do {
									this.P[var5] = og.readShort(123);
									++var5;
								} while (~var4 < ~var5);
							}
							
							var6 = 0;
							if (var8 != 0 || ~var4 < ~var6) {
								do {
									this.P[var6] += og.readShort(74) << 16;
									++var6;
								} while (~var4 < ~var6);
							}
							
							if (var8 == 0) {
								break label191;
							}
						}
						
						this.J = og.readShort(118);
						if (var8 == 0) {
							break label191;
						}
					}
					
					this.U = og.readShort(112);
					if (var8 == 0) {
						break label191;
					}
				}
				
				var4 = og.readShort(105);
				this.W = new int[var4];
				var5 = 0;
				if (var8 != 0 || var5 < var4) {
					do {
						this.W[var5] = og.readShort(88);
						++var5;
					} while (var5 < var4);
				}
				
				this.Z = new int[var4];
				var6 = 0;
				if (var8 != 0 || var4 > var6) {
					do {
						this.Z[var6] = og.readShort(66);
						++var6;
					} while (var4 > var6);
				}
				
				int var7 = 0;
				if (var8 != 0 || var4 > var7) {
					do {
						this.Z[var7] = (og.readShort(77) << 16) - -this.Z[var7];
						++var7;
					} while (var4 > var7);
				}
			}
			
			++I;
		} catch (RuntimeException var9) {
			throw bc.a(var9, "ce.J(" + (og != null ? "{...}" : "null") + ',' + value + ',' + var3 + ')');
		}
	}
	
	final fe a(fe fe, int i, int unused) {
		try {
			i = this.Z[i];
			++ab;
			hh hh = pc.a(0, i >> 16);
			i &= '\uffff';
			if (hh == null) {
				return fe.a(true);
			} else {
				fe fe1 = fe.a(!hh.b(-30419, i));
				fe1.a(hh, i);
				return fe1;
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "ce.D(" + (fe != null ? "{...}" : "null") + ',' + i + ',' + unused + ')');
		}
	}
	
	final fe a(fe fe, int i, boolean unused) {
		try {
			++O;
			int i1 = this.Z[i];
			hh hh = pc.a(0, i1 >> 16);
			i1 &= '\uffff';
			if (hh == null) {
				return fe.a(true);
			} else {
				hh hh1 = null;
				int i2 = 0;
				if (this.P != null && this.P.length > i) {
					i2 = this.P[i];
					hh1 = pc.a(0, i2 >> 16);
					i2 &= '\uffff';
				}
				fe fe1;
				if (hh1 != null && ~i2 != -65536) {
					fe1 = fe.a(!hh.b(-30419, i1) & !hh1.b(-30419, i2));
					fe1.a(hh, i1);
					fe1.a(hh1, i2);
					return fe1;
				} else {
					fe1 = fe.a(!hh.b(-30419, i1));
					fe1.a(hh, i1);
					return fe1;
				}
			}
		} catch (RuntimeException var9) {
			throw bc.a(var9, "ce.I(" + (fe != null ? "{...}" : "null") + ',' + i + ',' + unused + ')');
		}
	}
	
	final fe a(fe fe, int unused, ce ce, int i, int i1) {
		try {
			i1 = this.Z[i1];
			++N;
			hh hh = pc.a(0, i1 >> 16);
			i1 &= '\uffff';
			if (hh == null) {
				return ce.a(fe, i, -118);
			} else {
				i = ce.Z[i];
				hh hh1 = pc.a(0, i >> 16);
				i &= '\uffff';
				fe fe1;
				if (hh1 == null) {
					fe1 = fe.a(!hh.b(-30419, i1));
					fe1.a(hh, i1);
					return fe1;
				} else {
					fe1 = fe.a(!hh.b(-30419, i1) & !hh1.b(-30419, i));
					fe1.a(hh, i1, hh1, i, this.gb);
					return fe1;
				}
			}
		} catch (RuntimeException var9) {
			throw bc.a(var9, "ce.G(" + (fe != null ? "{...}" : "null") + ',' + unused + ',' + (ce != null ? "{...}" : "null") + ',' + i + ',' + i1 + ')');
		}
	}
}
