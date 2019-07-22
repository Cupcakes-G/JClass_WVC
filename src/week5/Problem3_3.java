import java.util.*;

public class Problem3_3 {
	public static void main(String[] args) {

		Stack<String> stack = new Stack<>();
		
		for (int i = 50; i <= 500; i++) {
			System.out.println("\nStarting number:" + i);
			if (bears(stack, i))
				while (!stack.isEmpty())
					System.out.println(stack.pop());
			else
				System.out.println("No solution");
		}
		


	}

	public static boolean bears(Stack<String> stack, int n) {
		int product;
		if (n < 42)
			return false;

		else if (n == 42)
			return true;

		// Moves on if condition isn't satisfied

		else if ((n % 5 == 0) && bears(stack, n - 42)) {
			stack.push("n = " + n + ", return " + 42 + ". Now n = " + (n - 42));

			return true;
		}

		else if ((n % 2 == 0) && bears(stack, n / 2)) {
			stack.push("n = " + n + ", return " + n / 2 + ". Now n = " + n / 2);
			return true;
		}
		else {
			product = (n % 10) * ((n % 100) / 10);
		

			if (product != 0 && (n % 4 == 0 || n % 3 == 0) && bears(stack, n - product)) {
	
				stack.push("n = " + n + ", return " + product + ". Now n = " + (n - product));
	
				return true;
	
			}
		}

		return false;
	}

}

//Starting number:50
//No solution
//
//Starting number:51
//No solution
//
//Starting number:52
//n = 52, return 10. Now n = 42
//
//Starting number:53
//No solution
//
//Starting number:54
//No solution
//
//Starting number:55
//No solution
//
//Starting number:56
//No solution
//
//Starting number:57
//No solution
//
//Starting number:58
//No solution
//
//Starting number:59
//No solution
//
//Starting number:60
//No solution
//
//Starting number:61
//No solution
//
//Starting number:62
//No solution
//
//Starting number:63
//No solution
//
//Starting number:64
//No solution
//
//Starting number:65
//No solution
//
//Starting number:66
//No solution
//
//Starting number:67
//No solution
//
//Starting number:68
//No solution
//
//Starting number:69
//No solution
//
//Starting number:70
//No solution
//
//Starting number:71
//No solution
//
//Starting number:72
//No solution
//
//Starting number:73
//No solution
//
//Starting number:74
//No solution
//
//Starting number:75
//No solution
//
//Starting number:76
//No solution
//
//Starting number:77
//No solution
//
//Starting number:78
//No solution
//
//Starting number:79
//No solution
//
//Starting number:80
//No solution
//
//Starting number:81
//No solution
//
//Starting number:82
//No solution
//
//Starting number:83
//No solution
//
//Starting number:84
//n = 84, return 42. Now n = 42
//
//Starting number:85
//No solution
//
//Starting number:86
//No solution
//
//Starting number:87
//No solution
//
//Starting number:88
//No solution
//
//Starting number:89
//No solution
//
//Starting number:90
//No solution
//
//Starting number:91
//No solution
//
//Starting number:92
//No solution
//
//Starting number:93
//No solution
//
//Starting number:94
//No solution
//
//Starting number:95
//No solution
//
//Starting number:96
//n = 96, return 54. Now n = 42
//
//Starting number:97
//No solution
//
//Starting number:98
//No solution
//
//Starting number:99
//No solution
//
//Starting number:100
//No solution
//
//Starting number:101
//No solution
//
//Starting number:102
//No solution
//
//Starting number:103
//No solution
//
//Starting number:104
//n = 104, return 52. Now n = 52
//n = 52, return 10. Now n = 42
//
//Starting number:105
//No solution
//
//Starting number:106
//No solution
//
//Starting number:107
//No solution
//
//Starting number:108
//No solution
//
//Starting number:109
//No solution
//
//Starting number:110
//No solution
//
//Starting number:111
//No solution
//
//Starting number:112
//No solution
//
//Starting number:113
//No solution
//
//Starting number:114
//No solution
//
//Starting number:115
//No solution
//
//Starting number:116
//No solution
//
//Starting number:117
//No solution
//
//Starting number:118
//No solution
//
//Starting number:119
//No solution
//
//Starting number:120
//No solution
//
//Starting number:121
//No solution
//
//Starting number:122
//No solution
//
//Starting number:123
//No solution
//
//Starting number:124
//No solution
//
//Starting number:125
//No solution
//
//Starting number:126
//No solution
//
//Starting number:127
//No solution
//
//Starting number:128
//No solution
//
//Starting number:129
//No solution
//
//Starting number:130
//No solution
//
//Starting number:131
//No solution
//
//Starting number:132
//No solution
//
//Starting number:133
//No solution
//
//Starting number:134
//No solution
//
//Starting number:135
//No solution
//
//Starting number:136
//No solution
//
//Starting number:137
//No solution
//
//Starting number:138
//No solution
//
//Starting number:139
//No solution
//
//Starting number:140
//No solution
//
//Starting number:141
//No solution
//
//Starting number:142
//No solution
//
//Starting number:143
//No solution
//
//Starting number:144
//No solution
//
//Starting number:145
//No solution
//
//Starting number:146
//No solution
//
//Starting number:147
//No solution
//
//Starting number:148
//No solution
//
//Starting number:149
//No solution
//
//Starting number:150
//No solution
//
//Starting number:151
//No solution
//
//Starting number:152
//No solution
//
//Starting number:153
//No solution
//
//Starting number:154
//No solution
//
//Starting number:155
//No solution
//
//Starting number:156
//No solution
//
//Starting number:157
//No solution
//
//Starting number:158
//No solution
//
//Starting number:159
//No solution
//
//Starting number:160
//No solution
//
//Starting number:161
//No solution
//
//Starting number:162
//No solution
//
//Starting number:163
//No solution
//
//Starting number:164
//No solution
//
//Starting number:165
//No solution
//
//Starting number:166
//No solution
//
//Starting number:167
//No solution
//
//Starting number:168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:169
//No solution
//
//Starting number:170
//No solution
//
//Starting number:171
//No solution
//
//Starting number:172
//No solution
//
//Starting number:173
//No solution
//
//Starting number:174
//No solution
//
//Starting number:175
//No solution
//
//Starting number:176
//No solution
//
//Starting number:177
//No solution
//
//Starting number:178
//No solution
//
//Starting number:179
//No solution
//
//Starting number:180
//No solution
//
//Starting number:181
//No solution
//
//Starting number:182
//No solution
//
//Starting number:183
//No solution
//
//Starting number:184
//No solution
//
//Starting number:185
//No solution
//
//Starting number:186
//No solution
//
//Starting number:187
//No solution
//
//Starting number:188
//No solution
//
//Starting number:189
//No solution
//
//Starting number:190
//No solution
//
//Starting number:191
//No solution
//
//Starting number:192
//n = 192, return 96. Now n = 96
//n = 96, return 54. Now n = 42
//
//Starting number:193
//No solution
//
//Starting number:194
//No solution
//
//Starting number:195
//No solution
//
//Starting number:196
//No solution
//
//Starting number:197
//No solution
//
//Starting number:198
//No solution
//
//Starting number:199
//No solution
//
//Starting number:200
//No solution
//
//Starting number:201
//No solution
//
//Starting number:202
//No solution
//
//Starting number:203
//No solution
//
//Starting number:204
//No solution
//
//Starting number:205
//No solution
//
//Starting number:206
//No solution
//
//Starting number:207
//No solution
//
//Starting number:208
//n = 208, return 104. Now n = 104
//n = 104, return 52. Now n = 52
//n = 52, return 10. Now n = 42
//
//Starting number:209
//No solution
//
//Starting number:210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:211
//No solution
//
//Starting number:212
//n = 212, return 2. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:213
//n = 213, return 3. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:214
//No solution
//
//Starting number:215
//No solution
//
//Starting number:216
//n = 216, return 6. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:217
//No solution
//
//Starting number:218
//No solution
//
//Starting number:219
//n = 219, return 9. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:220
//No solution
//
//Starting number:221
//No solution
//
//Starting number:222
//No solution
//
//Starting number:223
//No solution
//
//Starting number:224
//n = 224, return 8. Now n = 216
//n = 216, return 6. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:225
//No solution
//
//Starting number:226
//No solution
//
//Starting number:227
//No solution
//
//Starting number:228
//n = 228, return 16. Now n = 212
//n = 212, return 2. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:229
//No solution
//
//Starting number:230
//No solution
//
//Starting number:231
//n = 231, return 3. Now n = 228
//n = 228, return 16. Now n = 212
//n = 212, return 2. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:232
//No solution
//
//Starting number:233
//No solution
//
//Starting number:234
//No solution
//
//Starting number:235
//No solution
//
//Starting number:236
//No solution
//
//Starting number:237
//n = 237, return 21. Now n = 216
//n = 216, return 6. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:238
//No solution
//
//Starting number:239
//No solution
//
//Starting number:240
//No solution
//
//Starting number:241
//No solution
//
//Starting number:242
//No solution
//
//Starting number:243
//n = 243, return 12. Now n = 231
//n = 231, return 3. Now n = 228
//n = 228, return 16. Now n = 212
//n = 212, return 2. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:244
//n = 244, return 16. Now n = 228
//n = 228, return 16. Now n = 212
//n = 212, return 2. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:245
//No solution
//
//Starting number:246
//No solution
//
//Starting number:247
//No solution
//
//Starting number:248
//n = 248, return 32. Now n = 216
//n = 216, return 6. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:249
//n = 249, return 36. Now n = 213
//n = 213, return 3. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:250
//n = 250, return 42. Now n = 208
//n = 208, return 104. Now n = 104
//n = 104, return 52. Now n = 52
//n = 52, return 10. Now n = 42
//
//Starting number:251
//No solution
//
//Starting number:252
//No solution
//
//Starting number:253
//No solution
//
//Starting number:254
//No solution
//
//Starting number:255
//n = 255, return 42. Now n = 213
//n = 213, return 3. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:256
//No solution
//
//Starting number:257
//No solution
//
//Starting number:258
//No solution
//
//Starting number:259
//No solution
//
//Starting number:260
//No solution
//
//Starting number:261
//n = 261, return 6. Now n = 255
//n = 255, return 42. Now n = 213
//n = 213, return 3. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:262
//No solution
//
//Starting number:263
//No solution
//
//Starting number:264
//No solution
//
//Starting number:265
//No solution
//
//Starting number:266
//No solution
//
//Starting number:267
//No solution
//
//Starting number:268
//No solution
//
//Starting number:269
//No solution
//
//Starting number:270
//n = 270, return 42. Now n = 228
//n = 228, return 16. Now n = 212
//n = 212, return 2. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:271
//No solution
//
//Starting number:272
//No solution
//
//Starting number:273
//No solution
//
//Starting number:274
//No solution
//
//Starting number:275
//No solution
//
//Starting number:276
//No solution
//
//Starting number:277
//No solution
//
//Starting number:278
//No solution
//
//Starting number:279
//n = 279, return 63. Now n = 216
//n = 216, return 6. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:280
//No solution
//
//Starting number:281
//No solution
//
//Starting number:282
//No solution
//
//Starting number:283
//No solution
//
//Starting number:284
//No solution
//
//Starting number:285
//n = 285, return 42. Now n = 243
//n = 243, return 12. Now n = 231
//n = 231, return 3. Now n = 228
//n = 228, return 16. Now n = 212
//n = 212, return 2. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:286
//No solution
//
//Starting number:287
//No solution
//
//Starting number:288
//n = 288, return 64. Now n = 224
//n = 224, return 8. Now n = 216
//n = 216, return 6. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:289
//No solution
//
//Starting number:290
//n = 290, return 42. Now n = 248
//n = 248, return 32. Now n = 216
//n = 216, return 6. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:291
//No solution
//
//Starting number:292
//No solution
//
//Starting number:293
//No solution
//
//Starting number:294
//No solution
//
//Starting number:295
//No solution
//
//Starting number:296
//No solution
//
//Starting number:297
//No solution
//
//Starting number:298
//No solution
//
//Starting number:299
//No solution
//
//Starting number:300
//No solution
//
//Starting number:301
//No solution
//
//Starting number:302
//No solution
//
//Starting number:303
//No solution
//
//Starting number:304
//No solution
//
//Starting number:305
//No solution
//
//Starting number:306
//No solution
//
//Starting number:307
//No solution
//
//Starting number:308
//No solution
//
//Starting number:309
//No solution
//
//Starting number:310
//No solution
//
//Starting number:311
//No solution
//
//Starting number:312
//No solution
//
//Starting number:313
//No solution
//
//Starting number:314
//No solution
//
//Starting number:315
//No solution
//
//Starting number:316
//No solution
//
//Starting number:317
//No solution
//
//Starting number:318
//No solution
//
//Starting number:319
//No solution
//
//Starting number:320
//No solution
//
//Starting number:321
//No solution
//
//Starting number:322
//No solution
//
//Starting number:323
//No solution
//
//Starting number:324
//No solution
//
//Starting number:325
//No solution
//
//Starting number:326
//No solution
//
//Starting number:327
//No solution
//
//Starting number:328
//No solution
//
//Starting number:329
//No solution
//
//Starting number:330
//n = 330, return 42. Now n = 288
//n = 288, return 64. Now n = 224
//n = 224, return 8. Now n = 216
//n = 216, return 6. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:331
//No solution
//
//Starting number:332
//No solution
//
//Starting number:333
//No solution
//
//Starting number:334
//No solution
//
//Starting number:335
//No solution
//
//Starting number:336
//n = 336, return 168. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:337
//No solution
//
//Starting number:338
//No solution
//
//Starting number:339
//No solution
//
//Starting number:340
//No solution
//
//Starting number:341
//No solution
//
//Starting number:342
//No solution
//
//Starting number:343
//No solution
//
//Starting number:344
//No solution
//
//Starting number:345
//No solution
//
//Starting number:346
//No solution
//
//Starting number:347
//No solution
//
//Starting number:348
//No solution
//
//Starting number:349
//No solution
//
//Starting number:350
//No solution
//
//Starting number:351
//No solution
//
//Starting number:352
//No solution
//
//Starting number:353
//No solution
//
//Starting number:354
//No solution
//
//Starting number:355
//No solution
//
//Starting number:356
//No solution
//
//Starting number:357
//No solution
//
//Starting number:358
//No solution
//
//Starting number:359
//No solution
//
//Starting number:360
//No solution
//
//Starting number:361
//No solution
//
//Starting number:362
//No solution
//
//Starting number:363
//No solution
//
//Starting number:364
//No solution
//
//Starting number:365
//No solution
//
//Starting number:366
//n = 366, return 36. Now n = 330
//n = 330, return 42. Now n = 288
//n = 288, return 64. Now n = 224
//n = 224, return 8. Now n = 216
//n = 216, return 6. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:367
//No solution
//
//Starting number:368
//No solution
//
//Starting number:369
//No solution
//
//Starting number:370
//No solution
//
//Starting number:371
//No solution
//
//Starting number:372
//No solution
//
//Starting number:373
//No solution
//
//Starting number:374
//No solution
//
//Starting number:375
//No solution
//
//Starting number:376
//No solution
//
//Starting number:377
//No solution
//
//Starting number:378
//No solution
//
//Starting number:379
//No solution
//
//Starting number:380
//No solution
//
//Starting number:381
//No solution
//
//Starting number:382
//No solution
//
//Starting number:383
//No solution
//
//Starting number:384
//n = 384, return 192. Now n = 192
//n = 192, return 96. Now n = 96
//n = 96, return 54. Now n = 42
//
//Starting number:385
//No solution
//
//Starting number:386
//No solution
//
//Starting number:387
//No solution
//
//Starting number:388
//No solution
//
//Starting number:389
//No solution
//
//Starting number:390
//No solution
//
//Starting number:391
//No solution
//
//Starting number:392
//No solution
//
//Starting number:393
//n = 393, return 27. Now n = 366
//n = 366, return 36. Now n = 330
//n = 330, return 42. Now n = 288
//n = 288, return 64. Now n = 224
//n = 224, return 8. Now n = 216
//n = 216, return 6. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:394
//No solution
//
//Starting number:395
//No solution
//
//Starting number:396
//No solution
//
//Starting number:397
//No solution
//
//Starting number:398
//No solution
//
//Starting number:399
//No solution
//
//Starting number:400
//No solution
//
//Starting number:401
//No solution
//
//Starting number:402
//No solution
//
//Starting number:403
//No solution
//
//Starting number:404
//No solution
//
//Starting number:405
//No solution
//
//Starting number:406
//No solution
//
//Starting number:407
//No solution
//
//Starting number:408
//No solution
//
//Starting number:409
//No solution
//
//Starting number:410
//No solution
//
//Starting number:411
//No solution
//
//Starting number:412
//No solution
//
//Starting number:413
//No solution
//
//Starting number:414
//No solution
//
//Starting number:415
//No solution
//
//Starting number:416
//n = 416, return 208. Now n = 208
//n = 208, return 104. Now n = 104
//n = 104, return 52. Now n = 52
//n = 52, return 10. Now n = 42
//
//Starting number:417
//No solution
//
//Starting number:418
//No solution
//
//Starting number:419
//No solution
//
//Starting number:420
//n = 420, return 210. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:421
//No solution
//
//Starting number:422
//No solution
//
//Starting number:423
//No solution
//
//Starting number:424
//n = 424, return 212. Now n = 212
//n = 212, return 2. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:425
//No solution
//
//Starting number:426
//n = 426, return 213. Now n = 213
//n = 213, return 3. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:427
//No solution
//
//Starting number:428
//No solution
//
//Starting number:429
//No solution
//
//Starting number:430
//No solution
//
//Starting number:431
//No solution
//
//Starting number:432
//n = 432, return 216. Now n = 216
//n = 216, return 6. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:433
//No solution
//
//Starting number:434
//No solution
//
//Starting number:435
//n = 435, return 42. Now n = 393
//n = 393, return 27. Now n = 366
//n = 366, return 36. Now n = 330
//n = 330, return 42. Now n = 288
//n = 288, return 64. Now n = 224
//n = 224, return 8. Now n = 216
//n = 216, return 6. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:436
//No solution
//
//Starting number:437
//No solution
//
//Starting number:438
//n = 438, return 219. Now n = 219
//n = 219, return 9. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:439
//No solution
//
//Starting number:440
//No solution
//
//Starting number:441
//No solution
//
//Starting number:442
//No solution
//
//Starting number:443
//No solution
//
//Starting number:444
//No solution
//
//Starting number:445
//No solution
//
//Starting number:446
//No solution
//
//Starting number:447
//No solution
//
//Starting number:448
//n = 448, return 224. Now n = 224
//n = 224, return 8. Now n = 216
//n = 216, return 6. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:449
//No solution
//
//Starting number:450
//No solution
//
//Starting number:451
//No solution
//
//Starting number:452
//No solution
//
//Starting number:453
//n = 453, return 15. Now n = 438
//n = 438, return 219. Now n = 219
//n = 219, return 9. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:454
//No solution
//
//Starting number:455
//No solution
//
//Starting number:456
//n = 456, return 228. Now n = 228
//n = 228, return 16. Now n = 212
//n = 212, return 2. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:457
//No solution
//
//Starting number:458
//No solution
//
//Starting number:459
//No solution
//
//Starting number:460
//No solution
//
//Starting number:461
//No solution
//
//Starting number:462
//n = 462, return 231. Now n = 231
//n = 231, return 3. Now n = 228
//n = 228, return 16. Now n = 212
//n = 212, return 2. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:463
//No solution
//
//Starting number:464
//No solution
//
//Starting number:465
//n = 465, return 30. Now n = 435
//n = 435, return 42. Now n = 393
//n = 393, return 27. Now n = 366
//n = 366, return 36. Now n = 330
//n = 330, return 42. Now n = 288
//n = 288, return 64. Now n = 224
//n = 224, return 8. Now n = 216
//n = 216, return 6. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:466
//No solution
//
//Starting number:467
//No solution
//
//Starting number:468
//n = 468, return 48. Now n = 420
//n = 420, return 210. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:469
//No solution
//
//Starting number:470
//No solution
//
//Starting number:471
//No solution
//
//Starting number:472
//No solution
//
//Starting number:473
//No solution
//
//Starting number:474
//n = 474, return 237. Now n = 237
//n = 237, return 21. Now n = 216
//n = 216, return 6. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:475
//No solution
//
//Starting number:476
//No solution
//
//Starting number:477
//No solution
//
//Starting number:478
//No solution
//
//Starting number:479
//No solution
//
//Starting number:480
//n = 480, return 42. Now n = 438
//n = 438, return 219. Now n = 219
//n = 219, return 9. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:481
//No solution
//
//Starting number:482
//No solution
//
//Starting number:483
//No solution
//
//Starting number:484
//No solution
//
//Starting number:485
//No solution
//
//Starting number:486
//n = 486, return 243. Now n = 243
//n = 243, return 12. Now n = 231
//n = 231, return 3. Now n = 228
//n = 228, return 16. Now n = 212
//n = 212, return 2. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:487
//No solution
//
//Starting number:488
//n = 488, return 244. Now n = 244
//n = 244, return 16. Now n = 228
//n = 228, return 16. Now n = 212
//n = 212, return 2. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:489
//No solution
//
//Starting number:490
//n = 490, return 42. Now n = 448
//n = 448, return 224. Now n = 224
//n = 224, return 8. Now n = 216
//n = 216, return 6. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:491
//No solution
//
//Starting number:492
//n = 492, return 18. Now n = 474
//n = 474, return 237. Now n = 237
//n = 237, return 21. Now n = 216
//n = 216, return 6. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:493
//No solution
//
//Starting number:494
//No solution
//
//Starting number:495
//n = 495, return 42. Now n = 453
//n = 453, return 15. Now n = 438
//n = 438, return 219. Now n = 219
//n = 219, return 9. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:496
//n = 496, return 248. Now n = 248
//n = 248, return 32. Now n = 216
//n = 216, return 6. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:497
//No solution
//
//Starting number:498
//n = 498, return 249. Now n = 249
//n = 249, return 36. Now n = 213
//n = 213, return 3. Now n = 210
//n = 210, return 42. Now n = 168
//n = 168, return 84. Now n = 84
//n = 84, return 42. Now n = 42
//
//Starting number:499
//No solution
//
//Starting number:500
//n = 500, return 250. Now n = 250
//n = 250, return 42. Now n = 208
//n = 208, return 104. Now n = 104
//n = 104, return 52. Now n = 52
//n = 52, return 10. Now n = 42

