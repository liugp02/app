package com.pdgz.app.util;

public class RestServerStateCodeContant {

	/**
	 * 正确状态
	 */
	public static final String SUCCESS = "000000";
	
	/**
	 * 未知错误
	 */
	public static final String UN_KNOW_ERROR = "100101";
	
	/**
	 * 参数为空
	 */
	public static final String PARAM_NULL_ERROR = "100102";
	/**
	 * 视频点播参数为空
	 */
	public static final String PARAM_IS_NULL = "100003";
	
	/**
	 * 返回数据为空
	 */
	public static final String DATA_NULL_ERROR = "100103";
	
	/**
	 * token错误
	 */
	public static final String TOKEN_ERROR = "100104";
	
	/**
	 * 帐号或密码错误
	 */
	public static final String ACCOUNT_OR_PASSWORD_ERROR = "100105";
	
	/**
	 * 数据格式错误
	 */
	public static final String DATA_FORMAT_ERROR = "100106";
	
	/**
	 * 手机号未被绑定
	 */
	public static final String PHONE_NOT_BIND = "100107";
	
	/**
	 * 手机号已经被绑定
	 */
	public static final String PHONE_IS_BIND = "100110";
	
	/**
	 * 当前用户已经绑定了手机号
	 */
	public static final String TEACHER_IS_BINDPHONE = "100111";
	
	/**
	 * 该用户没有绑定过手机号
	 */
	public static final String TEACHER_NO_BINDPHONE = "100112";
	
	/**
	 * 短信验证码发送失败
	 */
	public static final String SMS_SEND_ERROR = "100108";
	
	/**
	 * 短信验证码错误
	 */
	public static final String SMS_ERROR = "100109";
	
	/**
	 * 参数被篡改
	 */
	public static final String PARAM_TEMPER = "100113";
	
	/**
	 * AES解密数据失败
	 */
	public static final String DATA_AES_DECRYPT_ERROR = "100114";
	
	/**
	 * 参数错误
	 */
	public static final String PARAM_ERROR = "100115";
	
	/**
	 * 文件不存在错误码
	 */
	public static final String FILE_NULL_ERROR = "100116";
	
	/**
	 * 文件夹不存在
	 */
	public static final String FOLDER_NULL_ERROR = "100117";
	
	/**
	 * 密码错误
	 */
	public static final String PASSWORD_ERROR = "100118";
	
	/**
	 * 维护群成员失败
	 */
	public static final String UPDATE_GROUP_FAIL = "100119";
	
	/**
	 * 薪资查询密码锁定
	 */
	public static final String CHECK_PWD_LOCK = "100120";
	
	public static final String DATA_IS_DELETE = "100121";
	
	public static final String VEDIO_INFO_EMPTY = "100122";
	
	public static final String VEDIO_INFO_TRANSCODING = "100123";
	
	/**  <p>操作失败.</p> */
	public static final String RESULTFALSEPASS = "444444";
	
	/**  <p>参数被篡改.</p> */
	public static final String PARAMTAMPER = "600001";
	
	/**  <p>用户不存在.</p> */
	public static final String USERINEXISTENCE  = "500001";
	
	/**  <p>验证码失效.</p> */
	public static final String CHECKCODE  = "500002";
	
	public static final String TOKENNUMBER = "100204";
	
	/**
	 * 电话为空
	 */
	public static final String PHONEISNULL = "100205";
	
	/**
	 * A号码、B号码相同
	 */
	public static final String PHONESEAM = "100206";
	
	/**
	 * 号码池满了，选号失败
	 */
	public static final String PHONEFULL = "100207";
	
	/**
	 * 手机号码格式不正确，比如有特殊字符等等
	 */
	public static final String PHONEFORMATERROR  = "100208";
	
	/**
	 * 教师端文案已经点赞
	 */
	public static final String TEACHINGPLANALREADYPRAISE  = "100209";
	
	/**
	 * 教师群已经存在
	 */
	public static final String TEACHERGROUPISEXISTENCE = "100210";
	
	/**
	 * 教案发送失败
	 */
	public static final String TEACHINGPLANSENDERROR = "100211";
	/**
	 * 调用网易建群失败
	 */
	public static final String WANGYICREATGROUP = "100212";
	
	/**
	 * 教师群超过人数上限
	 */
	public static final String PERSONFULL = "100213";
	/**
	 * 教师群拉人失败
	 */
	public static final String ADDMEMBERS = "100214";
	/**
	 * 踢人出群失败
	 */
	public static final String KICKMEMBER = "100215";
	/**
	 *维护管理员失败
	 */
	public static final String UPDATEMANAGER = "100216";
	
	/**
	 *设置管理员失败-管理员总数超过5人
	 */
	public static final String SETMANAGERCOUNT = "100217";
	
	/**
	 * 该教案已存在
	 */
	public static final String TEACHINGPLANEXIST = "100218";
	
	/**
	 * 周报接口添加的附件参数json数组格式化失败
	 */
	public static final String WEEKLYFILEFORMATERROR = "100219";
	
	/**
	 * 群组不存在
	 */
	public static final String GROUPNOTFOUND = "100220";
	
	/**
	 * 发送时间错误
	 */
	public static final String SENDTIMEERROR = "100221";
	
	/**
	 * 教案没有提交
	 */
	public static final String TEACHINGPLANNOTSUBMIT = "100222";

    public static final String LOGINFAILURE = "100223";

    public static final String STICKTOLONG = "100224";
	/**
	 * 只有主讲老师可以扫码登录
	 */
	public static final String TEACHERTOITSERROR = "100225";

	/**
	 * 扫码失败
	 */
	public static final String SWEEPERROR = "100226";

	/**
	 * 扫码失败
	 */
	public static final String CODELOSEEFFICACY = "100227";

	/**
	 * 二维码已被扫描
	 */
	public static final String CODEHADSCAN = "100228";

	/**
	 * 二维码超时
	 */
	public static final String CODETIMEOUT = "100229";

	/**
	 * 获取阿里云地址失败
	 */
	public static final String GETVEDIOURLERRO = "100300";

	/**
	 * 阿里客户端用户名密码验证码错误
	 */
	public static final String PASSWORDORAUTHCODEERROR = "100001";

	/**
	 * 阿里客户端获取sts失败
	 */
	public static final String GETSTSERROR = "100002";
}
