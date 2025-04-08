import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import chengji from '@/views/modules/chengji/list'
    import dictionary from '@/views/modules/dictionary/list'
    import laoshi from '@/views/modules/laoshi/list'
    import shebei from '@/views/modules/shebei/list'
    import shebeijiechu from '@/views/modules/shebeijiechu/list'
    import shebeisunhuai from '@/views/modules/shebeisunhuai/list'
    import shiyanshi from '@/views/modules/shiyanshi/list'
    import shiyanshipaike from '@/views/modules/shiyanshipaike/list'
    import shiyantai from '@/views/modules/shiyantai/list'
    import shiyantaishiyong from '@/views/modules/shiyantaishiyong/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import xueshengchuqin from '@/views/modules/xueshengchuqin/list'
    import dictionaryBanji from '@/views/modules/dictionaryBanji/list'
    import dictionaryChengjiLeixing from '@/views/modules/dictionaryChengjiLeixing/list'
    import dictionaryJieshu from '@/views/modules/dictionaryJieshu/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryShebei from '@/views/modules/dictionaryShebei/list'
    import dictionaryShiyanshikemu from '@/views/modules/dictionaryShiyanshikemu/list'
    import dictionaryXingqi from '@/views/modules/dictionaryXingqi/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryBanji',
        name: '班级名称',
        component: dictionaryBanji
    }
    ,{
        path: '/dictionaryChengjiLeixing',
        name: '类型',
        component: dictionaryChengjiLeixing
    }
    ,{
        path: '/dictionaryJieshu',
        name: '节数',
        component: dictionaryJieshu
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryShebei',
        name: '设备类型',
        component: dictionaryShebei
    }
    ,{
        path: '/dictionaryShiyanshikemu',
        name: '实验科目',
        component: dictionaryShiyanshikemu
    }
    ,{
        path: '/dictionaryXingqi',
        name: '星期',
        component: dictionaryXingqi
    }


    ,{
        path: '/chengji',
        name: '成绩',
        component: chengji
      }
    ,{
        path: '/dictionary',
        name: '字典',
        component: dictionary
      }
    ,{
        path: '/laoshi',
        name: '老师',
        component: laoshi
      }
    ,{
        path: '/shebei',
        name: '设备',
        component: shebei
      }
    ,{
        path: '/shebeijiechu',
        name: '设备借出',
        component: shebeijiechu
      }
    ,{
        path: '/shebeisunhuai',
        name: '设备损坏',
        component: shebeisunhuai
      }
    ,{
        path: '/shiyanshi',
        name: '实验室',
        component: shiyanshi
      }
    ,{
        path: '/shiyanshipaike',
        name: '实验室排课',
        component: shiyanshipaike
      }
    ,{
        path: '/shiyantai',
        name: '实验台',
        component: shiyantai
      }
    ,{
        path: '/shiyantaishiyong',
        name: '实验台使用记录',
        component: shiyantaishiyong
      }
    ,{
        path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
    ,{
        path: '/xueshengchuqin',
        name: '学生出勤',
        component: xueshengchuqin
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
