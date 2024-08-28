import { GithubOutlined } from '@ant-design/icons';
import { DefaultFooter } from '@ant-design/pro-components';
import '@umijs/max';
import React from 'react';

const Footer: React.FC = () => {
  const defaultMessage = '程序员兮颜';
  const currentYear = new Date().getFullYear();
  return (
    <DefaultFooter
      style={{
        background: 'none',
      }}
      copyright={`${currentYear} ${defaultMessage}`}
      links={[
        {
          key: 'github',
          title: (
            <>
              <GithubOutlined /> 兮颜源码
            </>
          ),
          href: 'https://github.com/LLLL1024',
          blankTarget: true,
        },
        {
          title: 'ICP备案号：赣ICP备2024039351号-1',
          href: "https://beian.miit.gov.cn/",
          blankTarget: true,
        },
      ]}
    />
  );
};
export default Footer;
