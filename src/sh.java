final class sh {

	static int a;
	private byte[] b;
	static int c;
	private int[] d;
	static ra e = null;
	static vc f = new vc(64);
	static int g;
	static int h;
	static int i;
	static int j;
	static ob k = rf.a(40, ")3");
	static pe cacheFile7;
	static int logoValue = -1;
	static int n;
	private int[] o;
	static int packetSize = 0;
	static ob enterYourUsernamePassword2;
	static int[] r = new int[256];
	private static ob enterYourUsernamePassword = rf.a(40, "Enter your username (V password)3");

	final int a (int var1, int var2, int var3, byte[] var4, byte[] var5, int var6) {
		int var15 = client.anInt_wb;

		try {
			++a;
			if (var1 != -786703935) {
				return -127;
			} else {
				var3 += var2;
				int var8 = var6 << 3;
				int var7 = 0;
				if (var15 == 0 && ~var2 <= ~var3) {
					return -var6 + (7 + var8 >> 3);
				} else {
					do {
						int var9 = var4[var2] & 255;
						int var10 = this.o[var9];
						byte var11 = this.b[var9];
						if (var11 == 0) {
							throw new RuntimeException("No codeword for data value " + var9);
						}

						int var12 = var8 >> 3;
						int var13 = 7 & var8;
						var8 += var11;
						var7 &= -var13 >> 31;
						int var14 = (-1 + var13 - -var11 >> 3) + var12;
						var13 += 24;
						var5[var12] = (byte) (var7 = ff.b(var7, var10 >>> var13));
						if (~var14 < ~var12) {
							var13 -= 8;
							++var12;
							var5[var12] = (byte) (var7 = var10 >>> var13);
							if (var12 < var14) {
								var13 -= 8;
								++var12;
								var5[var12] = (byte) (var7 = var10 >>> var13);
								if (var14 > var12) {
									var13 -= 8;
									++var12;
									var5[var12] = (byte) (var7 = var10 >>> var13);
									if (~var14 < ~var12) {
										++var12;
										var13 -= 8;
										var5[var12] = (byte) (var7 = var10 << -var13);
									}
								}
							}
						}

						++var2;
					} while (~var2 > ~var3);

					return -var6 + (7 + var8 >> 3);
				}
			}
		} catch (RuntimeException var16) {
			throw bc.a(var16, "sh.B(" + var1 + ',' + var2 + ',' + var3 + ',' + "{...}" + ',' + (var5 != null ? "{...}" : "null") + ',' + var6 + ')');
		}
	}

	public static void a (int var0) {
		try {
			r = null;
			enterYourUsernamePassword2 = null;
			e = null;
			if (var0 != 0) {
				r = null;
			}

			cacheFile7 = null;
			enterYourUsernamePassword = null;
			f = null;
			k = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "sh.F(" + var0 + ')');
		}
	}

	final int a (int var1, int var2, byte[] var3, int var4, byte[] var5, int var6) {
		int dummy = client.anInt_wb;

		try {
			++i;
			if (~var6 == -1) {
				return 0;
			} else {
				var6 += var2;
				int var7 = 0;
				int var8 = var4;

				do {
					byte var9;
					var9 = var5[var8];
					if (~var9 <= -1) {
						++var7;
					} else {
						var7 = this.d[var7];
					}

					int var10;
					if (~(var10 = this.d[var7]) > -1) {
						var3[var2++] = (byte) (~var10);
						if (~var6 >= ~var2) {
							break;
						}

						var7 = 0;
					}

					if ((64 & var9) != 0) {
						var7 = this.d[var7];
					} else {
						++var7;
					}

					if (~(var10 = this.d[var7]) > -1) {
						var3[var2++] = (byte) (~var10);
						if (~var6 >= ~var2) {
							break;
						}

						var7 = 0;
					}

					if (~(var9 & 32) != -1) {
						var7 = this.d[var7];
					} else {
						++var7;
					}

					if (~(var10 = this.d[var7]) > -1) {
						var3[var2++] = (byte) (~var10);
						if (var2 >= var6) {
							break;
						}

						var7 = 0;
					}

					label138:
					{
						if ((var9 & 16) != 0) {
							var7 = this.d[var7];
							if (dummy == 0) {
								break label138;
							}
						}

						++var7;
					}

					if (~(var10 = this.d[var7]) > -1) {
						var3[var2++] = (byte) (~var10);
						if (~var2 <= ~var6) {
							break;
						}

						var7 = 0;
					}

					label132:
					{
						if ((8 & var9) != 0) {
							var7 = this.d[var7];
							if (dummy == 0) {
								break label132;
							}
						}

						++var7;
					}

					if (~(var10 = this.d[var7]) > -1) {
						var3[var2++] = (byte) (~var10);
						if (var6 <= var2) {
							break;
						}

						var7 = 0;
					}

					label126:
					{
						if ((4 & var9) != 0) {
							var7 = this.d[var7];
							if (dummy == 0) {
								break label126;
							}
						}

						++var7;
					}

					if (~(var10 = this.d[var7]) > -1) {
						var3[var2++] = (byte) (~var10);
						if (~var2 <= ~var6) {
							break;
						}

						var7 = 0;
					}

					label120:
					{
						if ((var9 & 2) == 0) {
							++var7;
							if (dummy == 0) {
								break label120;
							}
						}

						var7 = this.d[var7];
					}

					if (~(var10 = this.d[var7]) > -1) {
						var3[var2++] = (byte) (~var10);
						if (~var6 >= ~var2) {
							break;
						}

						var7 = 0;
					}

					label114:
					{
						if (~(var9 & 1) == -1) {
							++var7;
							if (dummy == 0) {
								break label114;
							}
						}

						var7 = this.d[var7];
					}

					if ((var10 = this.d[var7]) < 0) {
						var3[var2++] = (byte) (~var10);
						if (~var2 <= ~var6) {
							break;
						}

						var7 = 0;
					}

					++var8;
				} while (dummy == 0);

				return var1 != 3 ? -118 : -var4 + var8 + 1;
			}
		} catch (RuntimeException var12) {
			throw bc.a(var12, "sh.C(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ',' + (var5 != null ? "{...}" : "null") + ',' + var6 + ')');
		}
	}

	static void b (int var0) {
		try {
			++h;
			ie.u.a((byte) 64);
			uc.jb = 1;
			m.cacheFile6 = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "sh.H(" + var0 + ')');
		}
	}

	static void a (int var0, gf var1) {
		try {
			long var2 = 0L;
			++n;
			int var4 = -1;
			if (~var1.M == -1) {
				var2 = wg.d(var1.v, var1.E, var1.J);
			}

			if (var1.M == 1) {
				var2 = ld.b(var1.v, var1.E, var1.J);
			}

			if (~var1.M == -3) {
				var2 = di.a(var1.v, var1.E, var1.J);
			}

			if (var1.M == 3) {
				var2 = rh.a(var1.v, var1.E, var1.J);
			}

			int var5 = 0;
			int var6 = 0;
			if (var2 != 0L) {
				var6 = 3 & (int) var2 >> 20;
				var5 = (int) var2 >> 14 & 31;
				var4 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
			}

			if (var0 == 8) {
				var1.D = var6;
				var1.p = var4;
				var1.H = var5;
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "sh.G(" + var0 + ',' + "{...}" + ')');
		}
	}

	static boolean a (int var0, int var1) {
		try {
			++c;
			if (var0 != 8) {
				r = null;
			}

			return (var1 >> 28 & 1) != 0;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "sh.A(" + var0 + ',' + var1 + ')');
		}
	}

	static int a (int var0, int var1, int var2) {
		int var4 = client.anInt_wb;

		try {
			++g;
			if (var2 != 1) {
				a(-31);
			}

			int var3 = 0;
			if (var4 == 0 && var0 <= 0) {
				return var3;
			} else {
				do {
					--var0;
					var3 = var3 << 1 | var1 & 1;
					var1 >>>= 1;
				} while (var0 > 0);

				return var3;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "sh.D(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	sh (byte[] data) {
		int dummy = client.anInt_wb;
		try {
			int length = data.length;
			this.d = new int[8];
			this.b = data;
			this.o = new int[length];
			int[] ints = new int[33];
			int i = 0;
			int i1 = 0;
			if (~i1 > ~length) {
				do {
					byte b = data[i1];
					if (b == 0) {
						++i1;
					} else {
						int i2;
						int i3;
						int i4;
						int i5;
						int i6;
						int i7 = 1 << 32 + -b;
						i2 = ints[b];
						this.o[i1] = i2;
						if (~(i2 & i7) != -1) {
							i3 = ints[-1 + b];
							if (dummy == 0) {
								//break label157;
							}
						} else {
							i3 = i7 | i2;
							i4 = b - 1;
							if (i4 >= 1) {
								do {
									i5 = ints[i4];
									if (i2 != i5) {
										break;
									}

									i6 = 1 << -i4 + 32;
									if ((i5 & i6) == 0) {
										ints[i4] = ff.b(i6, i5);
										if (dummy == 0) {/*
											--i4;
											continue;
										*/
										}
									} else {
										ints[i4] = ints[-1 + i4];
										if (dummy == 0) {
											break;
										}
									}
									--i4;
								} while (i4 >= 1);
							}
						}

						ints[b] = i3;
						i4 = b - -1;
						if (dummy != 0) {/*
							if (ints[i4] == i2) {
								ints[i4] = i3;
							}
							
							++i4;
						*/
						}

						for (; i4 <= 32; ++i4) {
							if (ints[i4] == i2) {
								ints[i4] = i3;
							}
						}

						i5 = 0;
						i6 = 0;
						if (dummy != 0) {
						}
						if (/*dummy == 0 && */b <= i6) {
							this.d[i5] = ~i1;
							if (~i >= ~i5) {
								i = 1 + i5;
							}

							++i1;
						} else {
							do {
								int var13 = Integer.MIN_VALUE >>> i6;
								if ((i2 & var13) == 0) {
									++i5;
									if (dummy == 0) {/*
										if (~this.d[i5] == -1) {
											this.d[i5] = i;
										}
										
										i5 = this.d[i5];
									*/
									}
								} else {
									if (~this.d[i5] == -1) {
										this.d[i5] = i;
									}

									i5 = this.d[i5];
								}

								if (this.d.length > i5) {
									var13 >>>= 1;
									++i6;
								} else {
									int[] var14 = new int[this.d.length * 2];
									int var15 = 0;
									while (var15 < this.d.length) {
										var14[var15] = this.d[var15];
										++var15;
									}

									this.d = var14;
									var13 >>>= 1;
									++i6;
								}
							} while (b > i6);

							this.d[i5] = ~i1;
							if (~i >= ~i5) {
								i = 1 + i5;
							}

							++i1;
						}
					}
				} while (~i1 > ~length);

			}
		} catch (RuntimeException var17) {
			throw bc.a(var17, "sh.<init>(" + "{...}" + ')');
		}
	}

	static void c (int size) {
		try {
			jg.a = new md(size);
			++j;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "sh.E(" + size + ')');
		}
	}

	static {
		enterYourUsernamePassword2 = enterYourUsernamePassword;
	}
}
